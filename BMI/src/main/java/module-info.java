module com.mycompany.bmi {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires java.logging;

    opens com.mycompany.bmi to javafx.fxml;
    exports com.mycompany.bmi;
}
