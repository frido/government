import { NgModule } from '@angular/core';
import { MatProgressSpinnerModule } from '@angular/material/progress-spinner';
import { SharedModule } from './../shared/components/shared.module';

import { StarostaPage } from './starosta.page';
import { CommonModule } from '@angular/common';
import { StarostaRoutingModule } from './starosta.routes';

@NgModule({
  declarations: [
    StarostaPage
  ],
  exports: [
    StarostaPage
  ],
  imports: [
    CommonModule,
    MatProgressSpinnerModule,
    SharedModule,
    StarostaRoutingModule
  ]
})
export class StarostaModule { }
