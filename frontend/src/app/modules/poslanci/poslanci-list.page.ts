import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { ApiService } from '../../api.service';
import { Observable } from 'rxjs';
import { OsobaView } from 'src/app/interfaces/interfaceOsoba';

@Component({
  templateUrl: './poslanci-list.page.html'
})
export class PoslanciListPage implements OnInit {
  $poslanci: Observable<OsobaView[]>;

  constructor(private route: ActivatedRoute, private service: ApiService) { }

  ngOnInit() {
    this.$poslanci = this.service.getClenovia(this.route.snapshot.data.spolok.id)
  }
}
