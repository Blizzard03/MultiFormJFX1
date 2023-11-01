module com.mariq.rasyid.multiformjfx1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.mariq.rasyid.multiformjfx1 to javafx.fxml;
    exports com.mariq.rasyid.multiformjfx1;
}
