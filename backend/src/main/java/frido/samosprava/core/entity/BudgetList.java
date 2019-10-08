package frido.samosprava.core.entity;

import java.util.List;

public class BudgetList {
  private List<Budget> budget;

  public List<Budget> getBudget() {
    return budget;
  }

  public void setResolutions(List<Budget> budget) {
    this.budget = budget;
  }
}
