import { Component } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { ApiService } from '../../api.service';
import { switchMap, tap } from 'rxjs/operators';
import { Observable } from 'rxjs';
import { OsobaView } from 'src/app/interfaces/interfaceOsoba';
import { FilterHolder } from '../shared/components/filter/filter.component';

@Component({
  templateUrl: './poslanci-show.page.html'
})
export class PoslanciShowPage {
  $poslanec: Observable<OsobaView>;
  $uznesenia: Observable<Uznesenie[]>;
  uznesenia: Uznesenie[] = [];
  uznesenia_pred: Uznesenie[] = [];
  uznesenia_za: Uznesenie[] = [];
  uznesenia_proti: Uznesenie[] = [];
  poslanecId: number;
  filter: FilterHolder;

  constructor(private route: ActivatedRoute, private service: ApiService) { }

  ngOnInit() {

    this.$poslanec = this.route.params.pipe(
      tap(params => this.poslanecId = +params['id']),
      switchMap(params => this.service.getPoslanec(+params['id'])
      ));

  }

  onFilter(filter: FilterHolder) {
    const selection = filter.selection();
    if ('pred' == selection) {
      this.uznesenia = this.uznesenia_pred
    }
    if ('za' == selection) {
      this.uznesenia = this.uznesenia_za
    }
    if ('proti' == selection) {
      this.uznesenia = this.uznesenia_proti
    }
    console.log('onFilter');
  }
  // TODO: unsubscribe
}
