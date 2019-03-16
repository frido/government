import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { ApiService } from '../../api.service';
import { Observable } from 'rxjs';

@Component({
  templateUrl: './uznesenia-list.page.html'
})
export class UzneseniaListPage implements OnInit {
  $uznesenia: Observable<Uznesenie[]>;
  filter: { [key: string]: boolean } = null;

  constructor(private route: ActivatedRoute, private service: ApiService) { }

  ngOnInit() {
    this.$uznesenia = this.service.getUznesenia(this.route.snapshot.data.spolok.id)
  }

  onFilter(filter: { [key: string]: boolean }) {
    this.filter = filter;
  }

  isVisible(uznesenie: Uznesenie): boolean {
    if (this.filter == null) {
      return true;
    }
    return this.filter[uznesenie.typ]
  }

}
