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

  import { VtabComponent } from './vtab.component';

  @Component({
    selector: 'app-vtabs',
    template: `
      <div class="tabs">
        <div class="tab" *ngFor="let tab of tabs" (click)="selectTab(tab)" [class.active]="tab.active">
          <span>{{tab.title}}</span>
        </div>
      </div>
      <ng-content></ng-content>
    `
  })
  export class VtabsComponent implements AfterContentInit {

    @ContentChildren(VtabComponent) tabs: QueryList<VtabComponent>;

    // contentChildren are set
    ngAfterContentInit() {
      // get all active tabs
      const activeTabs = this.tabs.filter((tab) => tab.active);

      // if there is no active tab set, activate the first
      if (activeTabs.length === 0) {
        this.selectTab(this.tabs.first);
      }
    }

    selectTab(tab: VtabComponent) {
      // deactivate all tabs
      this.tabs.toArray().forEach(t => t.active = false);

      // activate the tab the user has clicked on.
      if (tab) {
        tab.active = true;
      }
    }
  }
