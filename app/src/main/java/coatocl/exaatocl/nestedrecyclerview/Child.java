package coatocl.exaatocl.nestedrecyclerview;

public class Child
{
   private String category_child,note_child,account_child,income_child;

    Child(String category_child, String note_child, String account_child, String income_child) {
        this.category_child = category_child;
        this.note_child = note_child;
        this.account_child = account_child;
        this.income_child = income_child;
    }

    public String getCategory_child() {
        return category_child;
    }

    public String getNote_child() {
        return note_child;
    }

    public String getAccount_child() {
        return account_child;
    }

    public String getIncome_child() {
        return income_child;
    }
}
