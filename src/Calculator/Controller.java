package Calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {
    private String operator = " ";
    private int number1 = 0;
    private Model model = new Model();

    @FXML
    private TextField screen;

    public void showNumbers(ActionEvent event) {
        screen.setText(screen.getText() + ((Button)event.getSource()).getText());

    }
    public void operate(ActionEvent event) {
       if (((Button) event.getSource()).getText().equals("=")) {
           screen.setText(model.calculate(operator, number1, Integer.parseInt(screen.getText())) + "");
       } else {
           operator = ((Button)event.getSource()).getText();
           number1 = Integer.parseInt(screen.getText());
           screen.setText("");
       }

        }

    public void ClearScreen() {
        screen.clear();
    }


}
