import { Component, Input, EventEmitter, Output } from '@angular/core';

@Component({
  selector: 'app-search',
  templateUrl: './search.component.html'
})
export class SearchComponent {
  @Output() onSearch = new EventEmitter<SearchHolder>();
  @Input() search: SearchHolder;

  constructor() { }

  onChange(query: string) {
    this.search.query = query;
    this.onSearch.emit(this.search);
  }
}

export class SearchHolder {
  query: string;

  check(value: string) :boolean {
    return value.match(this.query) != null
  }
}
