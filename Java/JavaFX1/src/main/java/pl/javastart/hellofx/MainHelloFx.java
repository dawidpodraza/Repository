package pl.javastart.hellofx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainHelloFx extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        FXMLLoader loader = new FXMLLoader(
                getClass().getResource("/fxml/view.fxml")
        );

        Scene scene = new Scene(loader.load());

        stage.setTitle("Hello FX!");
        stage.setScene(scene);
        stage.show();
    }
}
