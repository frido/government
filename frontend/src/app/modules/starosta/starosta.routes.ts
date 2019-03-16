import { Routes, RouterModule } from '@angular/router';
import { StarostaPage } from './starosta.page';
import { NgModule } from '@angular/core';

const starostaRoutes: Routes = [
  {
    path: '',
    component: StarostaPage
  }
];

@NgModule({
  imports: [RouterModule.forChild(starostaRoutes)],
  exports: [RouterModule]
})
export class StarostaRoutingModule { }
