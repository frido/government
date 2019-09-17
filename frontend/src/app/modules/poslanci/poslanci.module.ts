import { NgModule } from '@angular/core';
import { SharedModule } from './../shared/components/shared.module';

import { PoslanciListPage } from './poslanci-list.page';
import { PoslanciShowPage } from './poslanci-show.page';
import { CommonModule } from '@angular/common';
import { PoslanciRoutingModule } from './poslanci.routes';
import { PoslanecComponent } from './poslanec.component';
import { PoslanecDetailComponent } from './poslanec-detail.component';
import { PoslanciHelperPage } from './poslanci-helper.page';

@NgModule({
  declarations: [
    PoslanciListPage, PoslanciShowPage, PoslanecComponent, PoslanecDetailComponent, PoslanciHelperPage
  ],
  exports: [
    PoslanciListPage, PoslanciShowPage
  ],
  imports: [
    CommonModule,
    SharedModule,
    PoslanciRoutingModule
  ]
})
export class PoslanciModule { }
