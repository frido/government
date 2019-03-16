import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-prijmy-card',
  templateUrl: './prijmy-card.component.html'
})
export class PrijmyCardComponent {
  @Input() rozpocet: Prijmy;
  @Input() level: number;
  opened = false;
}
