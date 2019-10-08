import { Component, Input } from '@angular/core';
import { OsobaView } from 'src/app/interfaces/interfaceOsoba';

@Component({
  selector: 'app-budget-detail',
  templateUrl: './budget-detail.component.html'
})
export class BudgetDetailComponent {
  @Input() budget: Budget;
}
