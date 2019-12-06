import { Component, Input } from '@angular/core';

@Component({
  selector: 'app-rss',
  templateUrl: './rss.component.html'
})
export class RssComponent {
  @Input() rssItem: RssItems;
  opened = false;

  constructor() { }

  get title(): String {
    return this.rssItem.link.replace('https://', '').substring(0, 40) + '...';
  }
}
