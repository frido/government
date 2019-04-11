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
      tap(params => {
        this.$uznesenia = this.service.getUznesenia(this.route.snapshot.data.spolok.id)
        this.$uznesenia.subscribe(data => {
          this.uznesenia_pred = [];
          this.uznesenia_za = [];
          this.uznesenia_proti = [];
          data.forEach(uznesenie => {
            if (uznesenie.predkladatel && uznesenie.predkladatel.some(x => x == this.poslanecId)) {
              this.uznesenia_pred.push(uznesenie);
            }
            if (uznesenie.za.some(x => x == this.poslanecId)) {
              this.uznesenia_za.push(uznesenie);
            }
            if (uznesenie.proti.some(x => x == this.poslanecId)) {
              this.uznesenia_proti.push(uznesenie);
            }
          });

          this.filter = new FilterHolder(false);

          if (this.uznesenia_pred.length != 0) {
            this.filter.add({ flag: false, icon: 'fas fa-thumbtack', key: 'pred', title: 'Predkladateľ' });
          }
          if (this.uznesenia_za.length != 0) {
            this.filter.add({ flag: false, icon: 'fas fa-thumbs-up', key: 'za', title: 'Hlasova ZA' });
          }
          if (this.uznesenia_proti.length != 0) {
            this.filter.add({ flag: false, icon: 'fas fa-thumbs-down', key: 'proti', title: 'Hlasova PROTI' });
          }
          if (this.filter.list.length > 0) {
            this.filter.list[0].flag = true;
          }

          this.onFilter(this.filter);
        })
      }),
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
