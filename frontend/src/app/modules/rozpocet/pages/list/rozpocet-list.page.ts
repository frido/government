import { Component, OnInit, OnDestroy } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { ApiService } from '../../../../api.service';
import { Observable } from 'rxjs';

@Component({
  templateUrl: './rozpocet-list.page.html'
})
export class RozpocetListPage implements OnInit {
  spolok: Spolok;
  rozpocet: Budget[];
  projects: Project[];
  grants: Project[];
  years: Set<number> = new Set();

  constructor(private route: ActivatedRoute, private service: ApiService) { }

  // TODO: unsubscribe

  ngOnInit() {
    this.spolok = this.route.snapshot.data.spolok;
    this.service.getRozpocet(this.spolok.id).subscribe(data => {
      this.rozpocet = data;
      this.rozpocet.forEach(r => {this.years.add(r.year)});
    });
    this.service.getProjects(this.spolok.id).subscribe(data => {
      this.projects = data;
      this.projects.forEach(r => this.years.add(r.year));
    });
    this.service.getGrants(this.spolok.id).subscribe(data => {
      this.grants = data;
      this.grants.forEach(r => this.years.add(r.year));
    });
  }

}
