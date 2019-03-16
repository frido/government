import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-google-chart-line-sumar',
  template: `
    <google-chart *ngIf="chart" [data]="chart"></google-chart>
  `
})
export class GoogleChartLineSumarComponent implements OnInit {
  @Input() sumar: Sumar[];
  chart: any;

  constructor() { }

  ngOnInit() {
    let min = 3000;
    let max = 0;
    for (const year of this.sumar.map(x => x.year)) {
      if (year > max) {
        max = year;
      }
      if (year < min) {
        min = year;
      }
    };
    const header: Array<Array<string|number>> = [['Rok', 'Suma']];
    this.chart = {
      chartType: 'LineChart',
      dataTable: header.concat(this.sumar.map(x => [""+x.year, x.prijmy]).reverse()),
      options: {
        'title': 'Vyvoj príjmov',
        legend: { position: 'bottom' },
        hAxis: {
          gridlines: { color: null, count: 4 },
          minValue: min,
          maxValue: max,
          format: '####'
        }
      }
    };
  }
}
