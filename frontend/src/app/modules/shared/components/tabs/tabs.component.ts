/**
 * The main component that renders single TabComponent
 * instances.
 */

import {
  Component,
  ContentChildren,
  QueryList,
  AfterContentInit
} from '@angular/core';

import { TabComponent } from './tab.component';

@Component({
  selector: 'app-tabs',
  template: `
      <div class="tabs">
        <div class="tab" *ngFor="let tab of tabs" (click)="selectTab(tab)" [class.active]="tab.active">
          <span>{{tab.title}}</span>
        </div>
      </div>
      <ng-content></ng-content>
    `
})
export class TabsComponent implements AfterContentInit {

  // @ContentChildren(TabComponent) tabs: QueryList<TabComponent>;
  tabs: TabComponent[] = []

  // contentChildren are set
  ngAfterContentInit() {
    // get all active tabs
    const activeTabs = this.tabs.filter((tab) => tab.active);

    // if there is no active tab set, activate the first
    if (activeTabs.length === 0) {
      if(this.tabs.length !== 0) {
        this.selectTab(this.tabs[0]);
      }
    }
  }

  selectTab(tab: TabComponent) {
    // deactivate all tabs
    this.tabs.forEach(t => t.active = false);

    // activate the tab the user has clicked on.
    tab.active = true;
  }

  notifyLoading(tab: TabComponent) {
    this.tabs.push(tab);
    this.ngAfterContentInit();
  }
}
