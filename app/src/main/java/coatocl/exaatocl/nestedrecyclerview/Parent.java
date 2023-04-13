package coatocl.exaatocl.nestedrecyclerview;

import java.util.List;

public class Parent
{
    private String date_parent,day_parent,month_year_parent,income_parent,expense_parent;
    List<Child>childList;

    public Parent(String date_parent, String day_parent, String month_year_parent, String income_parent, String expense_parent, List<Child> childList) {
        this.date_parent = date_parent;
        this.day_parent = day_parent;
        this.month_year_parent = month_year_parent;
        this.income_parent = income_parent;
        this.expense_parent = expense_parent;
        this.childList = childList;
    }

    public String getDate_parent() {
        return date_parent;
    }

    public String getDay_parent() {
        return day_parent;
    }

    public String getMonth_year_parent() {
        return month_year_parent;
    }

    public String getIncome_parent() {
        return income_parent;
    }

    public String getExpense_parent() {
        return expense_parent;
    }

    public List<Child> getChildList() {
        return childList;
    }

}
