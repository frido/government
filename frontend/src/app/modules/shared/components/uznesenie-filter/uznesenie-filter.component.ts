import { Component, Input, OnInit, EventEmitter, Output } from '@angular/core';
import { IconTypeService, IconType } from '../../icon-type.service';

@Component({
  selector: 'app-uznesenie-filter',
  templateUrl: './uznesenie-filter.component.html'
})
export class UznesenieFilterComponent implements OnInit {
  @Output() onFilter = new EventEmitter<{ [key: string]: boolean }>();
  filter: { [key: string]: boolean } = {};
  icons: IconType[];

  constructor(private iconsService: IconTypeService) { }

  ngOnInit() {
    this.iconsService.getIconKeys().forEach(x => {
      this.filter[x] = true;
    });
    this.icons = this.iconsService.getIcons();
  }

  vote(typ: string) {
    if (this.filter[typ]) {
      this.filter[typ] = false;
    } else {
      this.filter[typ] = true;
    }
    this.onFilter.emit(this.filter);
  }
}
