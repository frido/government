import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { ApiService } from '../../api.service';
import { Observable } from 'rxjs';

@Component({
  templateUrl: './starosta.page.html'
})
export class StarostaPage implements OnInit {
  $ciele: Observable<Ciel[]>;

  constructor(private route: ActivatedRoute, private service: ApiService) { }

  ngOnInit() {
    //this.$ciele = this.service.getCiele(this.route.snapshot.data.spolok.key)
  }
}
