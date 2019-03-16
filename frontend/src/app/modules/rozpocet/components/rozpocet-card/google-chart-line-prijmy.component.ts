import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-google-chart-line-prijmy',
  template: `
    <google-chart *ngIf="chart" [data]="chart"></google-chart>
  `
})
export class GoogleChartLinePrijmyComponent implements OnInit {
  @Input() prijmy: Prijmy;
  chart: any;

  constructor() { }

  ngOnInit() {
    let min = 3000;
    let max = 0;
    for (const year of this.prijmy.money.map(x => x.year)) {
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
      dataTable: header.concat(this.prijmy.money.map(x => [""+x.year, x.suma]).reverse()),
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
