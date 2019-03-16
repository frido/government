import { Component, OnInit, OnDestroy } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { ApiService } from '../../../../api.service';

@Component({
  templateUrl: './rozpocet-list.page.html'
})
export class RozpocetListPage implements OnInit {
  spolok: Spolok;
  rozpocet: Rozpocet;
  useKv: UseKv[] = [];
  query: string;

  constructor(private route: ActivatedRoute, private service: ApiService) { }

  ngOnInit() {
    this.spolok = this.route.snapshot.data.spolok;
      this.service.getRozpocet(this.spolok.id).subscribe(body2 => {
        this.rozpocet = body2;
        this.rozpocet.vydavky.forEach(element => {
          this.setUseKv(element);
        });
        this.useKv = this.useKv.sort((a, b) => b.suma - a.suma);
      });
    this.route.queryParamMap.subscribe(params => {
      this.query = params.get('detail');
    });
  }

  // setCurrentMoney(elem: any) {
  //   elem.current = this.getCurrectYear(elem.money);
  //   elem.sub.forEach(sub => {
  //     this.setCurrentMoney(sub);
  //   });
  // }

  // getCurrectYear(list: Array<any>): any {
  //   return list[0];
  //   return list.find(x => x.year === 2019);
  // }

  setUseKv(element: any) {
    if (element.current.useKv) {
      this.useKv = this.useKv.concat(element.current.useKv);
    }
    element.sub.forEach(sub => {
      this.setUseKv(sub);
    });
  }


}
