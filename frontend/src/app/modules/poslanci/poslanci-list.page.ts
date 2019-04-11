import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { ApiService } from '../../api.service';
import { Observable } from 'rxjs';
import { OsobaView } from 'src/app/interfaces/interfaceOsoba';
import { FilterHolder } from '../shared/components/filter/filter.component';

@Component({
  templateUrl: './poslanci-list.page.html'
})
export class PoslanciListPage implements OnInit {
  $poslanci: Observable<OsobaView[]>;
  filter: FilterHolder = null;

  constructor(private route: ActivatedRoute, private service: ApiService) { }

  ngOnInit() {
    this.$poslanci = this.service.getClenovia(this.route.snapshot.data.spolok.id);
    this.filter = new FilterHolder(true);
    this.filter.add({flag: true, icon: 'fas fa-chess-king', key: '4', title: 'Starosta'})
    this.filter.add({flag: true, icon: 'fas fa-user-lock', key: '2', title: 'Zamestnanci MÚ'})
    this.filter.add({flag: true, icon: 'fas fa-user-tie', key: '1', title: 'Poslanci'})
    this.filter.add({flag: true, icon: 'fas fa-user', key: '3', title: 'Neposlanci'})
  }

  onFilter(filter: FilterHolder) {
    this.filter = filter;
  }

  isVisible(osoba: OsobaView): boolean {
    return this.filter.check(''+osoba.role);
  }
}
