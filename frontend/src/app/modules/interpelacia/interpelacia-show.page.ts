import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { ActivatedRoute, Router } from '@angular/router';
import { ApiService } from '../../api.service';
import { switchMap } from 'rxjs/operators';

@Component({
  templateUrl: './interpelacia-show.page.html'
})
export class InterpelaciaShowPage implements OnInit {
  $interpelacia: Observable<Interpelacia>;

  constructor(private route: ActivatedRoute, private service: ApiService) { }

  ngOnInit() {
    // this.$interpelacia = this.route.params.pipe(
    //   switchMap(params => this.service.getInterpelacia(+params['id'])
    //   ))
  }
}
