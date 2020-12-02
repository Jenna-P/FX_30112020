package Lotto;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private TextField txt1;
    @FXML
    private TextField txt2;
    @FXML
    private TextField txt3;
    @FXML
    private TextField txt4;
    @FXML
    private TextField txt5;

    public void showLottoNumber() {
        int[] lottoNumber = new int[50];

        for (int i = 0; i < lottoNumber.length; i++) {
            lottoNumber[i] = (1 + (int) (Math.random() * 45));
            txt1.setText(Integer.toString(lottoNumber[0]));
            txt2.setText(Integer.toString(lottoNumber[1]));
            txt3.setText(Integer.toString(lottoNumber[2]));
            txt4.setText(Integer.toString(lottoNumber[3]));
            txt5.setText(Integer.toString(lottoNumber[4]));

            for(int j = 0; j < i; j++){
                if(lottoNumber[i] == lottoNumber[j]){
                    lottoNumber[i] = (1+(int)(Math.random() * 45));
                    break;
                }
            }

        }

    }

        public void resetNumber() {
            txt1.clear();
            txt2.clear();
            txt3.clear();
            txt4.clear();
            txt5.clear();

        }

}
