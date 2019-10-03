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
  // uzneseniaAll: Uznesenie[] = [];
  // uzneseniaVisible: Uznesenie[] = [];
  meetings: MeetingResolutionList[] = [];
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
      console.log(m);
      m.reverse().forEach(x => {
        this.meetings.push({ meeting: x, resolutions: [], fResolutions: [], loaded: false});
      })

      this.selectMeeting(this.meetings[0])
    })
  }

  selectMeeting(meeting: MeetingResolutionList) {
    console.log("selectMeeting");
    console.log(meeting);
    this.service.getUzneseniaMeeting(meeting.meeting.id).subscribe(
      x => {
        console.log("x");
        console.log(x);
        meeting.resolutions = x;
        meeting.loaded = true;
        this.applyFilter();
      }
    );
  }

//   private deleteMeeting(item: Meeting) {
//     console.log("deleteMeeting");
//     console.log(item);
//     const index: number = this.meetings.indexOf(item);
//     if (index !== -1) {
//       this.meetings.splice(index, 1);
//     }
//     console.log(this.meetings);
// }

  applyFilter() {
    console.log("applyFilter");
    // console.log(this.uzneseniaAll);
    this.meetings.forEach(m => {
      m.fResolutions = m.resolutions.filter(u => this.filter.check(u.type));
      m.fResolutions = m.fResolutions.filter(u => this.search.check(u.title));
    })
    console.log(this.meetings);
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
