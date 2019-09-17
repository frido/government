import { Routes, RouterModule } from '@angular/router';
import { PoslanciListPage } from './poslanci-list.page';
import { PoslanciShowPage } from './poslanci-show.page';
import { NgModule } from '@angular/core';
import { PoslanciHelperPage } from './poslanci-helper.page';

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
    path: 'helper',
    component: PoslanciHelperPage
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
