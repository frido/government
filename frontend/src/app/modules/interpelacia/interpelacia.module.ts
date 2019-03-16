import { NgModule } from '@angular/core';
import {MatProgressSpinnerModule} from '@angular/material/progress-spinner';
import { SharedModule } from '../shared/components/shared.module';

import { InterpelaciaListPage } from './interpelacia-list.page';
import { InterpelaciaShowPage } from './interpelacia-show.page';
import { CommonModule } from '@angular/common';
import { InterpelaciaRoutingModule } from './interpelacia.routes';

@NgModule({
  declarations: [
    InterpelaciaListPage, InterpelaciaShowPage
  ],
  exports: [
    InterpelaciaListPage, InterpelaciaShowPage
  ],
  imports: [
    CommonModule,
    MatProgressSpinnerModule,
    SharedModule,
    InterpelaciaRoutingModule
  ]
})
export class InterpelaciaModule { }
