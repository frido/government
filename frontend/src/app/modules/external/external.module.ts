import { NgModule } from '@angular/core';

import { SharedModule } from './../shared/components/shared.module';

import { CommonModule } from '@angular/common';
import { ExternalRoutingModule } from './external.routes';
import { ExternalListPage } from './external-list.page';
import { RssComponent } from './rss.component';

@NgModule({
  declarations: [
    ExternalListPage,
    RssComponent
  ],
  exports: [
    ExternalListPage
  ],
  imports: [
    CommonModule,
    SharedModule,
    ExternalRoutingModule
  ]
})
export class ExternalModule { }
