module com.example.set_exercise {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.set_exercise to javafx.fxml;
    exports com.example.set_exercise;
}