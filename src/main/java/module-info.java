module io.supreme.dev.code.wordbomb {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires com.almasb.fxgl.all;

    opens io.supreme.dev.code.wordbomb to javafx.fxml;
    exports io.supreme.dev.code.wordbomb;
}