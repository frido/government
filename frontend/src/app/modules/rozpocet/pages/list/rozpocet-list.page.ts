import { Component, OnInit, OnDestroy } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { ApiService } from '../../../../api.service';
import { Observable } from 'rxjs';

@Component({
  templateUrl: './rozpocet-list.page.html'
})
export class RozpocetListPage implements OnInit {
  spolok: Spolok;
  $rozpocet: Observable<Budget[]>;
  $projects: Observable<Budget[]>;
  $grants: Observable<Budget[]>;

  constructor(private route: ActivatedRoute, private service: ApiService) { }

  ngOnInit() {
    this.spolok = this.route.snapshot.data.spolok;
    this.$rozpocet = this.service.getRozpocet(this.spolok.id);
    this.$projects = this.service.getProjects(this.spolok.id);
    this.$grants = this.service.getGrants(this.spolok.id);
  }

}
