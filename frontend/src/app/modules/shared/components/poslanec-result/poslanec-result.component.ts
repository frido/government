import { Component, Input  } from '@angular/core';
import { OsobaView } from 'src/app/interfaces/interfaceOsoba';

@Component({
  selector: 'app-poslanec-result',
  templateUrl: './poslanec-result.component.html'
})
export class PoslanecResultComponent{
  @Input() poslanec: OsobaView;

  constructor() {}
}
