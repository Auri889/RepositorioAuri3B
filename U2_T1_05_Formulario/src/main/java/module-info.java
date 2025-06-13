module mx.edu.utez.u2_t1_05_formulario {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires jdk.management.jfr;
    requires java.desktop;

    opens mx.edu.utez.u2_t1_05_formulario to javafx.fxml;
    exports mx.edu.utez.u2_t1_05_formulario;
}