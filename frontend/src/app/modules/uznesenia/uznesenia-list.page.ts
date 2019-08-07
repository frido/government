import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { ApiService } from '../../api.service';
import { Observable } from 'rxjs';
import { IconTypeService } from '../shared/icon-type.service';
import { FilterHolder } from '../shared/components/filter/filter.component';
import { SearchHolder } from '../shared/components/search/search.component';

@Component({
  templateUrl: './uznesenia-list.page.html'
})
export class UzneseniaListPage implements OnInit {
  uzneseniaAll: Uznesenie[] = [];
  uzneseniaVisible: Uznesenie[] = [];
  meetings: Meeting[];
  // $uznesenia: Observable<Uznesenie[]>;
  filter: FilterHolder = null;
  search: SearchHolder = null;

  constructor(private route: ActivatedRoute, private service: ApiService, private iconsService: IconTypeService) { }

  ngOnInit() {
    console.log("ngOnInit");
    this.filter = new FilterHolder(true);
    this.search = new SearchHolder();
    this.iconsService.getIcons().forEach(icon => {
      this.filter.add({ flag: true, icon: icon.class, key: icon.key, title: icon.title });
    });
    this.service.getMeetings(this.route.snapshot.data.spolok.id).subscribe(m => {
      this.meetings = m.reverse();
      this.selectMeeting(m[0])
    })
  }

  selectMeeting(meeting: Meeting) {
    console.log("selectMeeting");
    this.service.getUzneseniaMeeting(this.route.snapshot.data.spolok.id, meeting.id).subscribe(
      x => {
        this.uzneseniaAll = this.uzneseniaAll.concat(x);
        this.applyFilter();
        this.deleteMeeting(meeting);
      }
    );
  }

  private deleteMeeting(item: Meeting) {
    console.log("deleteMeeting");
    console.log(item);
    console.log(this.meetings);
    const index: number = this.meetings.indexOf(item);
    if (index !== -1) {
      this.meetings.splice(index, 1);
    }
    console.log(this.meetings);
}

  applyFilter() {
    console.log("applyFilter");
    this.uzneseniaVisible = this.uzneseniaAll.filter(u => this.filter.check(u.typ));
    this.uzneseniaVisible = this.uzneseniaVisible.filter(u => this.search.check(u.nadpis));
  }

  onFilter(filter: FilterHolder) {
    console.log("onFilter");
    this.filter = filter;
    this.applyFilter();
  }

  onSearch(search: SearchHolder) {
    console.log("onSearch");
    this.search = search;
    this.applyFilter();
  }

}
