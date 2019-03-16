import { Component, Input, OnInit  } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Location } from '@angular/common';

@Component({
  selector: 'app-menu',
  templateUrl: './menu.component.html'
})
export class MenuComponent implements OnInit {
  active: string;
  spolok: Spolok;

  names = {
    'uznesenia': 'Uznesenia',
    'interpelacia': 'Interpelácie',
    'poslanci': 'Poslanci',
    'rozpocet': 'Rozpočet',
    'vystavba': 'Výstavba',
    'starosta': 'Starosta'
  };

  constructor(private route: ActivatedRoute, private location: Location) {}

  ngOnInit() {
    this.spolok = this.route.snapshot.data.spolok;
    const path = this.location.path();
    this.active = path.split('/')[2];
  }
}
