package pl.javastart.hellofx;

import javafx.application.Application;
import javafx.stage.Stage;

public class MainHelloFx extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        stage.setTitle("Hello FX!");
        stage.show();
    }
}