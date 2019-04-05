import { Component, Input, EventEmitter, Output } from '@angular/core';

@Component({
  selector: 'app-filter',
  templateUrl: './filter.component.html'
})
export class FilterComponent {
  @Output() onFilter = new EventEmitter<FilterHolder>();
  @Input() filter: FilterHolder;

  constructor() { }

  vote(typ: string) {
    this.filter.vote(typ);
    this.onFilter.emit(this.filter);
  }
}

export interface Filter {
  title: string;
  key: string;
  flag: boolean;
  icon: string;
}

export class FilterHolder {
  map: { [key: string]: Filter } = {};
  list: Filter[] = [];
  multi: boolean

  constructor(multi: boolean) {
    this.multi = multi;
  }

  add(filter: Filter): void {
    this.map[filter.key] = filter;
    this.list.push(filter);
  }

  items(): Filter[] {
    return this.list
  }

  item(key: string) :Filter {
    return this.map[key];
  }

  check(key: string) :boolean {
    const f = this.map[key];
    return f ? f.flag : false
  }

  selection(): string {
    const f = this.list.find(x => x.flag == true);
    return f ? f.key : null;
  }

  vote(key: string) {
    if(this.multi == false) {
      this.list.forEach(e => {
        e.flag = false;
      });
    }

    const f = this.item(key);
    if (f.flag) {
      f.flag = false;
    } else {
      f.flag = true;
    }
  }
}
