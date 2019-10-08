import { Component } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { ApiService } from '../../api.service';
import { switchMap, tap } from 'rxjs/operators';
import { Observable } from 'rxjs';
import { OsobaView } from 'src/app/interfaces/interfaceOsoba';

@Component({
  templateUrl: './poslanci-show.page.html'
})
export class PoslanciShowPage {
  $poslanec: Observable<OsobaView>;
  $uznesenia: Observable<Uznesenie[]>;
  uznesenia: Uznesenie[] = [];
  poslanecId: number;

  constructor(private route: ActivatedRoute, private service: ApiService) { }

  ngOnInit() {

    this.$poslanec = this.route.params.pipe(
      tap(params => this.poslanecId = +params['id']),
      switchMap(params => this.service.getPoslanec(+params['id'])
    ));

    this.$uznesenia = this.route.params.pipe(
      tap(params => this.poslanecId = +params['id']),
      switchMap(params => this.service.getUzneseniaCreator(+params['id'])
    ));
  }
}
