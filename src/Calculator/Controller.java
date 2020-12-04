package Calculator;



import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.io.IOException;


public class Controller {
    private String operator = " ";
    private int number1 = 0;
    private Model model = new Model();


    @FXML
    private TextField screen;
    @FXML
    private Button bt1;


    public void showNumbers(ActionEvent event) throws IOException {
        screen.setText(screen.getText() + ((Button) event.getSource()).getText());
        try {
            CalData data = new CalData();
            data.dataScreen = screen.getText();
            Calculator.Filehandling filehandling = new Calculator.Filehandling();
            filehandling.save(data);
        } catch (IOException e) {
        System.out.println("Error");
    } 

    }
    public void operate(ActionEvent event) {
       if (((Button) event.getSource()).getText().equals("=")) {
           screen.setText(model.calculate(operator, number1, Integer.parseInt(screen.getText())) + "");
       } else {
           operator = ((Button)event.getSource()).getText();
           number1 = Integer.parseInt(screen.getText());
           screen.setText("");
       }

        try {
            CalData data = new CalData();
            data.dataScreen = screen.getText();
            Calculator.Filehandling filehandling = new Calculator.Filehandling();
            filehandling.save(data);
        } catch (IOException e) {
            System.out.println("Error");
        }

    }

    public void ClearScreen() {
        screen.clear();
    }

  /* @FXML
    void save(ActionEvent event) throws IOException {
        CalData data = new CalData();
        data.dataScreen = screen.getText();
        Calculator.Filehandling filehandling = new Calculator.Filehandling();
        filehandling.save(data);
    }

    @FXML
    void load(ActionEvent event) throws IOException {
        Calculator.Filehandling filehandling = new Calculator.Filehandling();
        CalData data;
        data = filehandling.load();

        screen.setText(data.dataScreen);

    }

*/




}
