package RollDice;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
   

    @FXML
    private StackPane pane;

    @FXML
    private ImageView image;

    Image dice1 = new Image("Image/1.png");
    Image dice2 = new Image("Image/2.png");
    Image dice3 = new Image("Image/3.png");
    Image dice4 = new Image("Image/4.png");
    Image dice5 = new Image("Image/5.png");
    Image dice6 = new Image("Image/6.png");


    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
    public void showDiceNumber() {

        int dice = (1+(int)(Math.random() * 6));
        pane.getChildren().remove(image);
        if (dice == 1) {
            image = new ImageView(dice1);
        }
        else if (dice == 2) {
            image = new ImageView(dice2);
        }else if (dice == 3) {
            image = new ImageView(dice3);
        }else if (dice == 4) {
            image = new ImageView(dice4);
        }else if (dice == 5) {
            image = new ImageView(dice5);
        }else if (dice == 6) {
            image = new ImageView(dice6);
        }

        pane.getChildren().add(image);





    }
}
