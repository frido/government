import { NgModule } from '@angular/core';

import { SharedModule } from './../shared/components/shared.module';

import { UzneseniaListPage } from './uznesenia-list.page';
import { UzneseniaShowPage } from './uznesenia-show.page';
import { UzneseniaRoutingModule } from './uznesenia.routes';
import { CommonModule } from '@angular/common';

@NgModule({
  declarations: [
    UzneseniaListPage, UzneseniaShowPage
  ],
  exports: [
    UzneseniaListPage, UzneseniaShowPage
  ],
  imports: [
    CommonModule,
    SharedModule,
    UzneseniaRoutingModule
  ]
})
export class UzneseniaModule { }
