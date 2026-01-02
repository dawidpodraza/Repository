package pl.javastart.hellofx;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller {

    @FXML
    private Button buttonDown;

    @FXML
    private Button buttonUP;

    @FXML
    private Label labelDown;

    @FXML
    private Label labelUp;


    public void initialize() {
        buttonDown.setText("Down");
        buttonUP.setText("Up");
        labelDown.setText("Down");
        labelUp.setText("Up");
    }
}
