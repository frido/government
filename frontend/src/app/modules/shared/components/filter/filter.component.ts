import { Component, Input, EventEmitter, Output } from '@angular/core';

@Component({
  selector: 'app-filter',
  templateUrl: './filter.component.html'
})
export class FilterComponent {
  @Output() onFilter = new EventEmitter<Option>();
  @Input() options: Option[];

  selectedValue: Option;

  constructor() { }

  selected(){
    this.onFilter.emit(this.selectedValue);
  }
}

export interface Option {
  label: string;
  value: string;
  payload?: any;
}
