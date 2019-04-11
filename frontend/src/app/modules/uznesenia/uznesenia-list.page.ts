import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { ApiService } from '../../api.service';
import { Observable } from 'rxjs';
import { IconTypeService } from '../shared/icon-type.service';
import { FilterHolder } from '../shared/components/filter/filter.component';

@Component({
  templateUrl: './uznesenia-list.page.html'
})
export class UzneseniaListPage implements OnInit {
  $uznesenia: Observable<Uznesenie[]>;
  filter: FilterHolder = null;

  constructor(private route: ActivatedRoute, private service: ApiService, private iconsService: IconTypeService) { }

  ngOnInit() {
    this.$uznesenia = this.service.getUznesenia(this.route.snapshot.data.spolok.id);
    this.filter = new FilterHolder(true);
    this.iconsService.getIcons().forEach(icon => {
      this.filter.add({flag: true, icon: icon.class, key: icon.key, title: icon.title});
    });

  }

  onFilter(filter: FilterHolder) {
    this.filter = filter;
  }

  isVisible(uznesenie: Uznesenie): boolean {
    return this.filter.check(uznesenie.typ);
  }

}
