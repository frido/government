import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-google-chart-pie-prijmy',
  template: `
    <google-chart *ngIf="chart" [data]="chart"></google-chart>
  `
})
export class GoogleChartPiePrijmyComponent implements OnInit {
  @Input() prijmy: Prijmy[];
  chart: any;

  constructor() { }

  ngOnInit() {
    const header: Array<Array<string|number>> = [['Title', 'Suma']];
    this.chart = {
      chartType: 'PieChart',
      dataTable: header.concat(this.prijmy.map(x => [x.title, x.current.suma])),
      options: {
        'title': 'Podiel príjmov',
        legend: { position: 'right' }
      }
    };
  }
}
