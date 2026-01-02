module hellofx {
    requires javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;

    exports pl.javastart.hellofx;
    opens pl.javastart.hellofx to javafx.fxml;

}