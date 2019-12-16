import { Component, OnInit, OnDestroy } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { ApiService } from '../../../../api.service';
import { Observable } from 'rxjs';

@Component({
  templateUrl: './rozpocet-list.page.html'
})
export class RozpocetListPage implements OnInit {
  spolok: Spolok;
  budgetList: Budget[] = [];
  rozpocet: { [key:number]:Budget[]; } = {};
  projects:  { [key:number]:Project[]; } = {};
  grants: { [key:number]:Project[]; } = {};

  yearsList: number[] = [];
  activeYear: number = 2020;

  constructor(private route: ActivatedRoute, private service: ApiService) { }

  // TODO: unsubscribe

  ngOnInit() {
    let years: Set<number> = new Set();
    this.spolok = this.route.snapshot.data.spolok;
    this.service.getRozpocet(this.spolok.id).subscribe(data => {
      this.budgetList = data;
      data.forEach(r => {
        if(this.rozpocet[r.year] == undefined) {
          this.rozpocet[r.year] = [];
          years.add(r.year);
        }
        this.rozpocet[r.year].push(r);
      });
      years.forEach(y => this.yearsList.push(y));
      this.yearsList.sort((a, b) => b - a);
    });
    this.service.getProjects(this.spolok.id).subscribe(data => {
      data.forEach(r => {
        if(this.projects[r.year] == undefined) {
          this.projects[r.year] = [];
        }
        this.projects[r.year].push(r);
      });
    });
    this.service.getGrants(this.spolok.id).subscribe(data => {
      data.forEach(r => {
        if(this.grants[r.year] == undefined) {
          this.grants[r.year] = [];
        }
        this.grants[r.year].push(r);
      });
    });
  }

  clickActiveYear(year: number) {
    this.activeYear = year;
  }

  isProjectsVisible(year: number): Boolean {
    return (this.projects[year] == null || this.projects[year].length == null);
  }


  isGrantsVisible(year: number): Boolean {
    return (this.grants[year] == null || this.grants[year].length == null);
  }

}
