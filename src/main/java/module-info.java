module com.example.passingbetweenscenesjfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.passingbetweenscenesjfx to javafx.fxml;
    exports com.example.passingbetweenscenesjfx;
}