module co.edu.javeriana.proyecto_ads {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens co.edu.javeriana.proyecto_ads to javafx.fxml;
    exports co.edu.javeriana.proyecto_ads;
}