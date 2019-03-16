import { Component, Input } from '@angular/core';
import { OsobaView } from 'src/app/interfaces/interfaceOsoba';

@Component({
  selector: 'app-poslanec',
  templateUrl: './poslanec.component.html'
})
export class PoslanecComponent {
  @Input() poslanec: OsobaView;
  opened = false;

  constructor() { }

}
