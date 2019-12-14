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

  years: Set<number> = new Set();
  activeYear: number = 2020;

  constructor(private route: ActivatedRoute, private service: ApiService) { }

  // TODO: unsubscribe

  ngOnInit() {
    this.spolok = this.route.snapshot.data.spolok;
    this.service.getRozpocet(this.spolok.id).subscribe(data => {
      this.budgetList = data;
      data.forEach(r => {
        if(this.rozpocet[r.year] == undefined) {
          this.rozpocet[r.year] = [];
          this.years.add(r.year);
        }
        this.rozpocet[r.year].push(r);
      });
    });
    this.service.getProjects(this.spolok.id).subscribe(data => {
      // this.projects = data;
      // this.projects.forEach(r => this.years.add(r.year));
    });
    this.service.getGrants(this.spolok.id).subscribe(data => {
      // this.grants = data;
      // this.grants.forEach(r => this.years.add(r.year));
    });
  }

  clickActiveYear(year: number) {
    this.activeYear = year;
  }

}
