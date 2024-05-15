module com.expense.expensetracker {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.expense.expensetracker to javafx.fxml;
    exports com.expense.expensetracker;
}