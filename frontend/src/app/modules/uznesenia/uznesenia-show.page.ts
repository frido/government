import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { ActivatedRoute } from '@angular/router';
import { switchMap } from 'rxjs/operators';
import { ApiService } from '../../api.service';

@Component({
  templateUrl: './uznesenia-show.page.html'
})
export class UzneseniaShowPage implements OnInit {
  $uznesenie: Observable<Uznesenie>;

  constructor(
    private route: ActivatedRoute,
    private service: ApiService
  ) { }

  ngOnInit() {
    this.$uznesenie = this.route.params.pipe(
      switchMap(params => this.service.getUznesenie(+params['id'])
      ))
  }
}
