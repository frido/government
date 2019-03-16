import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { ApiService } from '../../api.service';
import { Observable } from 'rxjs';

@Component({
  templateUrl: './vystavba-list.page.html'
})
export class VystavbaListPage implements OnInit {
  $vystavby: Observable<Vystavba[]>;

  constructor(private route: ActivatedRoute, private service: ApiService) { }

  ngOnInit() {
    //this.$vystavby = this.service.getVystavba(this.route.snapshot.data.spolok.key);
  }

}
