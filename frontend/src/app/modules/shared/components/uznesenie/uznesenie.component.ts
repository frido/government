import { Component, Input } from '@angular/core';

@Component({
  selector: 'app-uznesenie',
  templateUrl: './uznesenie.component.html'
})
export class UznesenieComponent {
  @Input() uznesenie: Uznesenie;
  opened = false;
}
