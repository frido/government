import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { ApiService } from '../../api.service';
import { Observable } from 'rxjs';
import { OsobaView } from 'src/app/interfaces/interfaceOsoba';

@Component({
  styles: ['.active {color: red}'],
  templateUrl: './poslanci-helper.page.html'
})
export class PoslanciHelperPage implements OnInit {
  poslanci: OsobaView[];
  selected: OsobaView[] = [];

  constructor(private route: ActivatedRoute, private service: ApiService) { }

  ngOnInit() {
    const spolok = this.route.snapshot.data.spolok;
    this.service.getClenovia("" + spolok.id).subscribe(data => this.poslanci = data);
  }

  selectAll() {
    this.poslanci.forEach(p => this.click(p));
  }

  click(poslanec: OsobaView) {
    if (this.isSelected(poslanec)) {
      const index = this.selected.indexOf(poslanec, 0);
      if (index > -1) {
        this.selected.splice(index, 1);
      }
    } else {
      this.selected.push(poslanec);
    }
  }

  get selectedIds() {
    return this.selected.map(p => p.id);
  }

  isSelected(poslanec: OsobaView) {
    return this.selected.find(p => p === poslanec)
  }

}
