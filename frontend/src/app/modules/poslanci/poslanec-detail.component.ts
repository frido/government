import { Component, Input } from '@angular/core';
import { OsobaView } from 'src/app/interfaces/interfaceOsoba';

@Component({
  selector: 'app-poslanec-detail',
  templateUrl: './poslanec-detail.component.html'
})
export class PoslanecDetailComponent {
  @Input() poslanec: OsobaView;

  constructor() { }
}


