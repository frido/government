import { Component, Input, OnInit } from '@angular/core';
import { OsobaView } from 'src/app/interfaces/interfaceOsoba';

@Component({
  selector: 'app-budget-detail',
  templateUrl: './budget-detail.component.html'
})
export class BudgetDetailComponent implements OnInit {
  
  @Input() budget: Budget;
  @Input() budgetList: Budget[];
  yearsList: number[] = [];
  budgetMap: Map<number, Budget[]> = new Map();

  ngOnInit(): void {
    let years: Set<number> = new Set();
    this.budgetList.forEach(b => {
      if (b.number == this.budget.number) {
        // if (b.year != this.budget.year) {
          console.log(b);
          years.add(b.year);
          console.log(years);
          let yearBudget = this.budgetMap.get(b.year);
          if (yearBudget == null || yearBudget == undefined) {
            yearBudget = [];
          };
          yearBudget.push(b);
          this.budgetMap.set(b.year, yearBudget);
          console.log(this.budgetMap);
        // }
      }
    });
    years.forEach(y => this.yearsList.push(y));
    this.yearsList.sort((a, b) => b - a);
  }
  
}
