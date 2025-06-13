module mx.edu.utez.u2_t1_04 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens mx.edu.utez.u2_t1_04 to javafx.fxml;
    exports mx.edu.utez.u2_t1_04;
}