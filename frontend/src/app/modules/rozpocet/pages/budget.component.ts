import { Component, Input } from '@angular/core';
import { OsobaView } from 'src/app/interfaces/interfaceOsoba';

@Component({
  selector: 'app-budget',
  templateUrl: './budget.component.html'
})
export class BudgetComponent {
  @Input() budget: Budget;
  opened = false;

  constructor() { }

}
