import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-google-chart-pie-vydavky',
  template: `
    <google-chart *ngIf="chart" [data]="chart"></google-chart>
  `
})
export class GoogleChartPieVydavkyComponent implements OnInit {
  @Input() vydavky: Vydavky[];
  chart: any;

  constructor() { }

  ngOnInit() {
    const header: Array<Array<string|number>> = [['Title', 'Suma']];
    this.chart = {
      chartType: 'PieChart',
      dataTable: header.concat(this.vydavky.map(x => [""+x.title, x.current.bv + x.current.kv + x.current.fv])),
      options: {
        'title': 'Podiel výdajov',
        legend: { position: 'right' }
      }
    };
  }
}
