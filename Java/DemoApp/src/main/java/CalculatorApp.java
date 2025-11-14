import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Glow;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class CalculatorApp extends Application {

    private TextField display;
    private double firstNumber = 0;
    private String operator = "";
    private boolean startNewNumber = true;

    @Override
    public void start(Stage primaryStage) {
        // Wyświetlacz
        display = new TextField();
        display.setAlignment(Pos.CENTER_RIGHT);
        display.setEditable(false);
        display.setFont(Font.font("Consolas", 32));
        display.setStyle("-fx-background-color: #0f0f0f; -fx-text-fill: #39ff14; -fx-padding: 15; -fx-border-color: #39ff14; -fx-border-width: 2;");
        display.setPrefHeight(80);

        // Przyciski
        GridPane buttons = createButtons();

        VBox root = new VBox(20, display, buttons);
        root.setPadding(new Insets(20));
        root.setStyle("-fx-background-color: #0a0a0a;");

        Scene scene = new Scene(root, 380, 520);
        primaryStage.setTitle("Cyberpunk Calculator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private GridPane createButtons() {
        GridPane grid = new GridPane();
        grid.setHgap(12);
        grid.setVgap(12);
        grid.setAlignment(Pos.CENTER);

        String[][] buttonLayout = {
                {"7", "8", "9", "/"},
                {"4", "5", "6", "*"},
                {"1", "2", "3", "-"},
                {"0", ".", "=", "+"},
                {"C"}
        };

        for (int i = 0; i < buttonLayout.length; i++) {
            for (int j = 0; j < buttonLayout[i].length; j++) {
                String text = buttonLayout[i][j];
                Button btn = new Button(text);
                btn.setPrefSize(80, 80);
                btn.setFont(Font.font("Consolas", 24));
                btn.setStyle(getButtonStyle(text));
                DropShadow shadow = new DropShadow(20, Color.CYAN);
                btn.setEffect(shadow);

                // efekt neon glow po najechaniu
                btn.setOnMouseEntered(e -> btn.setEffect(new Glow(0.8)));
                btn.setOnMouseExited(e -> btn.setEffect(shadow));

                btn.setOnAction(e -> handleButton(text));
                grid.add(btn, j, i);
            }
        }

        return grid;
    }

    private String getButtonStyle(String text) {
        if ("0123456789.".contains(text)) {
            return "-fx-background-color: #111; -fx-text-fill: #00ffcc; -fx-background-radius: 15; -fx-border-color: #00ffcc; -fx-border-radius: 15; -fx-border-width: 2;";
        } else if ("C".equals(text)) {
            return "-fx-background-color: #ff0055; -fx-text-fill: #ffffff; -fx-background-radius: 15; -fx-border-color: #ff00aa; -fx-border-width: 2;";
        } else {
            return "-fx-background-color: #2200ff; -fx-text-fill: #ffffff; -fx-background-radius: 15; -fx-border-color: #00ffff; -fx-border-width: 2;";
        }
    }

    private void handleButton(String text) {
        switch (text) {
            case "C":
                display.clear();
                firstNumber = 0;
                operator = "";
                startNewNumber = true;
                break;

            case "+": case "-": case "*": case "/":
                if (!display.getText().isEmpty()) {
                    firstNumber = Double.parseDouble(display.getText());
                    operator = text;
                    startNewNumber = true;
                }
                break;

            case "=":
                if (operator.isEmpty() || display.getText().isEmpty()) return;
                double secondNumber = Double.parseDouble(display.getText());
                double result = calculate(firstNumber, secondNumber, operator);
                display.setText(String.valueOf(result));
                operator = "";
                startNewNumber = true;
                break;

            default: // liczby i kropka
                if (startNewNumber) {
                    display.clear();
                    startNewNumber = false;
                }
                if (text.equals(".") && display.getText().contains(".")) return;
                display.appendText(text);
        }
    }

    private double calculate(double num1, double num2, String op) {
        return switch (op) {
            case "+" -> num1 + num2;
            case "-" -> num1 - num2;
            case "*" -> num1 * num2;
            case "/" -> num2 != 0 ? num1 / num2 : 0;
            default -> 0;
        };
    }

    public static void main(String[] args) {
        launch(args);
    }
}
