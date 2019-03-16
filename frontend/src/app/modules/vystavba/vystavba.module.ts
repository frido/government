import { NgModule } from '@angular/core';
import { MatProgressSpinnerModule } from '@angular/material/progress-spinner';
import { SharedModule } from './../shared/components/shared.module';

import { VystavbaListPage } from './vystavba-list.page';
import { CommonModule } from '@angular/common';
import { VystavbaRoutingModule } from './vystavba.routes';
import { VystavbaComponent } from './vystavba.component';

@NgModule({
  declarations: [
    VystavbaListPage, VystavbaComponent
  ],
  exports: [
    VystavbaListPage, VystavbaComponent
  ],
  imports: [
    CommonModule,
    MatProgressSpinnerModule,
    SharedModule,
    VystavbaRoutingModule
  ]
})
export class VystavbaModule { }
