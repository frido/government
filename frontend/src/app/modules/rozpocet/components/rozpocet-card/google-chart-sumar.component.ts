import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-google-chart-sumar',
  template: `
    <google-chart *ngIf="chart" [data]="chart"></google-chart>
  `
})
export class GoogleChartSumarComponent implements OnInit {
  @Input() sumar: Sumar[];
  chart: any;

  constructor() { }

  ngOnInit() {
    let minS = 3000;
    let maxS = 0;
    for (const year of this.sumar.map(x => x.year)) {
      if (year > maxS) {
        maxS = year;
      }
      if (year < minS) {
        minS = year;
      }
    };
    const header: Array<Array<(string|number)>> = [['Rok', 'Príjmy', 'Výdavky']];
    this.chart = {
      chartType: 'ColumnChart',
      dataTable: header.concat(this.sumar.map(x => [""+x.year, x.prijmy, x.vydavky]).reverse()),
      options: {
        'title': 'Príjmy vs Výdavky',
        legend: { position: 'right' },
        hAxis: {
          gridlines: { color: null, count: 4 },
          minValue: minS,
          maxValue: maxS,
          format: '####'
        }
      }
    };
  }
}
