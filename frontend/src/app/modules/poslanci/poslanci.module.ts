import { NgModule } from '@angular/core';
import { MatProgressSpinnerModule } from '@angular/material/progress-spinner';
import { SharedModule } from './../shared/components/shared.module';

import { PoslanciListPage } from './poslanci-list.page';
import { PoslanciShowPage } from './poslanci-show.page';
import { CommonModule } from '@angular/common';
import { PoslanciRoutingModule } from './poslanci.routes';
import { PoslanecComponent } from './poslanec.component';
import { PoslanecDetailComponent } from './poslanec-detail.component';

@NgModule({
  declarations: [
    PoslanciListPage, PoslanciShowPage, PoslanecComponent, PoslanecDetailComponent
  ],
  exports: [
    PoslanciListPage, PoslanciShowPage
  ],
  imports: [
    CommonModule,
    MatProgressSpinnerModule,
    SharedModule,
    PoslanciRoutingModule
  ]
})
export class PoslanciModule { }
