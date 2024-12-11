module org.camara.audiorecorder {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires java.desktop;
    requires java.net.http;
    requires org.json;
    requires javafx.swing;

    opens com.camara.exercice to javafx.fxml;
    exports com.camara.exercice;
}