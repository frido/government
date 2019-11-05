import { Component } from '@angular/core';
import { spolky } from '../shared/spolky';

@Component({
  templateUrl: './intro.page.html'
})
export class IntroPage {
  detva: Spolok;
  petrzalka: Spolok

  ngOnInit() {
    this.detva = spolky.find(x => x.key === 'detva');
    this.petrzalka = spolky.find(x => x.key === 'petrzalka');
  }

}
