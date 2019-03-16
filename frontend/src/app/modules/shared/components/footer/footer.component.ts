import { Component, Input, OnInit  } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { tap, map } from 'rxjs/operators';
import { spolky } from '../../spolky';

@Component({
  selector: 'app-footer',
  templateUrl: './footer.component.html'
})
export class FooterComponent implements OnInit {
  spolok: Spolok;
  route2: any;

  constructor(private route: ActivatedRoute) {}

  ngOnInit() {
    this.route.params.pipe(
      map( params => spolky.find(x => x.key === params['spolok'])),
    ).subscribe( spolok => {
      this.spolok = spolok;
    });
  }

}
