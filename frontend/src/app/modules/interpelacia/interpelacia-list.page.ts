import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { ApiService } from '../../api.service';
import { Observable } from 'rxjs';

@Component({
  templateUrl: './interpelacia-list.page.html'
})
export class InterpelaciaListPage implements OnInit {
  $interpelacie: Observable<Interpelacia[]>;

  constructor(private route: ActivatedRoute, private service: ApiService) {}

  ngOnInit() {
    //this.$interpelacie = this.service.getInterpelacie(this.route.snapshot.data.spolok.key)
  }
}
