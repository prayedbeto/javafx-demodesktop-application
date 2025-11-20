module com.example.renovacionlicencias {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.renovacionlicencias to javafx.fxml;
    exports com.example.renovacionlicencias;
}