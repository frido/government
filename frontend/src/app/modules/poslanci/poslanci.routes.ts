import { Routes, RouterModule } from '@angular/router';
import { PoslanciListPage } from './poslanci-list.page';
import { PoslanciShowPage } from './poslanci-show.page';
import { NgModule } from '@angular/core';

const poslanciRoutes: Routes = [
  {
    path: '',
    redirectTo: 'list',
    pathMatch: 'full'
  },
  {
    path: 'list',
    component: PoslanciListPage
  },
  {
    path: 'show/:id',
    component: PoslanciShowPage
  }
];

@NgModule({
  imports: [RouterModule.forChild(poslanciRoutes)],
  exports: [RouterModule]
})
export class PoslanciRoutingModule { }
