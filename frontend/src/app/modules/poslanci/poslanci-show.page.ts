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
  poslanecId: number;

  constructor(private route: ActivatedRoute, private service: ApiService) { }

  ngOnInit() {
    this.$poslanec = this.route.params.pipe(
      tap(params => this.poslanecId = +params['id']),
      switchMap(params => this.service.getPoslanec(+params['id'])
      ));
    this.$uznesenia = this.service.getUznesenia(this.route.snapshot.data.spolok.id)
  }

  getClass(uznesenie: Uznesenie): string {
    if (uznesenie.predkladatel && uznesenie.predkladatel.some(x => x == this.poslanecId)){
      return 'poslanec-predkladatel';
    }
    if (uznesenie.za.some(x => x == this.poslanecId)){
      return 'poslanec-za';
    }
    if (uznesenie.proti.some(x => x == this.poslanecId)){
      return 'poslanec-proti';
    }
    return ''
  }
}
