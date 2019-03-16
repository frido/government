import { Routes, RouterModule } from '@angular/router';
import { RozpocetListPage } from './pages/list/rozpocet-list.page';
import { NgModule } from '@angular/core';

const rozpocetRoutes: Routes = [
    {
        path: '',
        component: RozpocetListPage
    }
];

@NgModule({
  imports: [RouterModule.forChild(rozpocetRoutes)],
  exports: [RouterModule]
})
export class RozpocetRoutingModule { }
