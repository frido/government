import { Routes, RouterModule } from '@angular/router';
import { UzneseniaListPage } from './uznesenia-list.page';
import { UzneseniaShowPage } from './uznesenia-show.page';
import { NgModule } from '@angular/core';

const uzneseniaRoutes: Routes = [
  {
    path: '',
    redirectTo: 'list',
    pathMatch: 'full'
  },
  {
    path: 'list',
    component: UzneseniaListPage
  },
  {
    path: 'show/:id',
    component: UzneseniaShowPage
  }
];

@NgModule({
  imports: [RouterModule.forChild(uzneseniaRoutes)],
  exports: [RouterModule]
})
export class UzneseniaRoutingModule { }
