import { Routes, RouterModule } from '@angular/router';
import { NgModule } from '@angular/core';
import { ExternalListPage } from './external-list.page';

const externalRoutes: Routes = [
  {
    path: '',
    redirectTo: 'list',
    pathMatch: 'full'
  },
  {
    path: 'list',
    component: ExternalListPage
  }
];

@NgModule({
  imports: [RouterModule.forChild(externalRoutes)],
  exports: [RouterModule]
})
export class ExternalRoutingModule { }
