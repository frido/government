import { Component, Input, OnInit  } from '@angular/core';

@Component({
  selector: 'app-vydavky-card',
  templateUrl: './vydavky-card.component.html'
})
export class VydavkyCardComponent {
  @Input() rozpocet: Vydavky;
  @Input() level: number;
  opened = false;
}
