import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { ApiService } from '../../api.service';
import { Observable } from 'rxjs';
import { IconTypeService } from '../shared/icon-type.service';
import { SearchHolder } from '../shared/components/search/search.component';
import { Option } from '../shared/components/filter/filter.component';

@Component({
  templateUrl: './uznesenia-list.page.html'
})
export class UzneseniaListPage implements OnInit {
  // uzneseniaAll: Uznesenie[] = [];
  // uzneseniaVisible: Uznesenie[] = [];
  meetings: MeetingResolutionList[] = [];
  // $uznesenia: Observable<Uznesenie[]>;
  options: Option[] = [{ value: null, label: '' }];
  search: SearchHolder = null;
  selectedOption: Option = this.options[0];

  constructor(private route: ActivatedRoute, private service: ApiService, private iconsService: IconTypeService) { }

  ngOnInit() {
    this.search = new SearchHolder();
    this.iconsService.getIcons().forEach(icon => {
      this.options.push({ value: icon.key, label: icon.title });
    });
    this.service.getMeetings(this.route.snapshot.data.spolok.id).subscribe(m => {
      m.reverse().forEach(x => {
        this.meetings.push({ meeting: x, resolutions: [], fResolutions: [], loaded: false });
      })

      this.selectMeeting(this.meetings[0])
    })
  }

  selectMeeting(meeting: MeetingResolutionList) {
    this.service.getUzneseniaMeeting(meeting.meeting.id).subscribe(
      x => {
        meeting.resolutions = x;
        meeting.loaded = true;
        this.applyFilter();
      }
    );
  }

  applyFilter() {
    this.meetings.forEach(m => {
      m.fResolutions = m.resolutions.filter(u => (this.selectedOption.value || u.type) === u.type);
      m.fResolutions = m.fResolutions.filter(u => this.search.check(u.title));
    })
  }

  onFilter(option: Option) {
    this.selectedOption = option;
    this.applyFilter();
  }

  onSearch(search: SearchHolder) {
    this.search = search;
    this.applyFilter();
  }

}
