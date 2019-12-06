import { Component, OnInit, OnDestroy, ContentChildren, QueryList, ViewChildren } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { ApiService } from 'src/app/api.service';

@Component({
  templateUrl: './external-list.page.html'
})
export class ExternalListPage implements OnInit {
  rssList: Rss[];

  constructor(private route: ActivatedRoute, private service: ApiService) { }

  // TODO: unsubscribe

  ngOnInit() {
    const spolok: Spolok = this.route.snapshot.data.spolok;
    this.service.getExternal('rss', spolok.id).subscribe(data => {
      this.rssList = data;
    });
  }

}
