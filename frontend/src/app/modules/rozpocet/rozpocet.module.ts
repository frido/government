import { NgModule } from '@angular/core';

import { SharedModule } from '../shared/components/shared.module';

import { RozpocetListPage } from './pages/list/rozpocet-list.page';
import { VydavkyCardComponent } from './components/rozpocet-card/vydavky-card.component';
import { PrijmyCardComponent } from './components/rozpocet-card/prijmy-card.component';

import { Ng2GoogleChartsModule, GoogleChartComponent } from 'ng2-google-charts';
import { CommonModule } from '@angular/common';
import { RozpocetRoutingModule } from './rozpocet.routes';
import { GoogleChartSumarComponent } from './components/rozpocet-card/google-chart-sumar.component';
import { GoogleChartPieVydavkyComponent } from './components/rozpocet-card/google-chart-pie-vydavky.component';
import { GoogleChartPiePrijmyComponent } from './components/rozpocet-card/google-chart-pie-prijmy.component';
import { GoogleChartLineSumarComponent } from './components/rozpocet-card/google-chart-line-sumar.component';
import { GoogleChartLinePrijmyComponent } from './components/rozpocet-card/google-chart-line-prijmy.component';
import { BudgetComponent } from './pages/budget.component';
import { BudgetDetailComponent } from './pages/budget-detail.component';

@NgModule({
  declarations: [
    RozpocetListPage, VydavkyCardComponent, PrijmyCardComponent,
    GoogleChartSumarComponent, GoogleChartPieVydavkyComponent,
    GoogleChartPiePrijmyComponent, GoogleChartLineSumarComponent, GoogleChartLinePrijmyComponent, BudgetComponent, BudgetDetailComponent
  ],
  exports: [
    RozpocetListPage
  ],
  imports: [
    CommonModule,
    SharedModule,
    Ng2GoogleChartsModule,
    RozpocetRoutingModule
  ]
})
export class RozpocetModule { }
