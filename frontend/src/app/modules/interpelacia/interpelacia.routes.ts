import { Routes, RouterModule } from '@angular/router';
import { InterpelaciaListPage } from './interpelacia-list.page';
import { InterpelaciaShowPage } from './interpelacia-show.page';
import { NgModule } from '@angular/core';

const interpelaciaRoutes: Routes = [
    {
        path: '',
        redirectTo: 'list',
        pathMatch: 'full'
    },
    {
        path: 'list',
        component: InterpelaciaListPage
    },
    {
        path: 'show/:id',
        component: InterpelaciaShowPage
    }
];

@NgModule({
  imports: [RouterModule.forChild(interpelaciaRoutes)],
  exports: [RouterModule]
})
export class InterpelaciaRoutingModule { }
