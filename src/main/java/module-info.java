module com.example.creditcard {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.creditcard to javafx.fxml;
    exports com.example.creditcard;
}