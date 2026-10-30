module com.leidy.trabajo {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.leidy.trabajo to javafx.fxml;
    exports com.leidy.trabajo;
    exports com.leidy.trabajo.Controller;
    opens com.leidy.trabajo.Controller to javafx.fxml;
}