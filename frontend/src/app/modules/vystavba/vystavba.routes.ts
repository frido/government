import { Routes, RouterModule } from '@angular/router';
import { VystavbaListPage } from './vystavba-list.page';
import { NgModule } from '@angular/core';

const vystavbaRoutes: Routes = [
  {
    path: '',
    redirectTo: 'list',
    pathMatch: 'full'
  },
  {
    path: 'list',
    component: VystavbaListPage
  }
];

@NgModule({
  imports: [RouterModule.forChild(vystavbaRoutes)],
  exports: [RouterModule]
})
export class VystavbaRoutingModule { }
