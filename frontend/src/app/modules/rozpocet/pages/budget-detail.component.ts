import { Component, Input, OnInit } from '@angular/core';
import { OsobaView } from 'src/app/interfaces/interfaceOsoba';

@Component({
  selector: 'app-budget-detail',
  templateUrl: './budget-detail.component.html'
})
export class BudgetDetailComponent implements OnInit {
  
  @Input() budget: Budget;
  @Input() budgetList: Budget[];
  years: Set<number> = new Set();
  budgetMap: Map<number, Budget[]> = new Map();

  ngOnInit(): void {
    this.budgetList.forEach(b => {
      if (b.number == this.budget.number) {
        if (b.year != this.budget.year) {
          console.log(b);
          this.years.add(b.year);
          console.log(this.years);
          let yearBudget = this.budgetMap.get(b.year);
          if (yearBudget == null || yearBudget == undefined) {
            yearBudget = [];
          };
          yearBudget.push(b);
          this.budgetMap.set(b.year, yearBudget);
          console.log(this.budgetMap);
        }
      }
    })
  }
  
}
