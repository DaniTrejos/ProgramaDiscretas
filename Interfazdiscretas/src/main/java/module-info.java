module org.example.interfazdiscretas {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.interfazdiscretas to javafx.fxml;
    exports org.example.interfazdiscretas;
}