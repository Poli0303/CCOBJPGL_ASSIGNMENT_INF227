package Controller;

import Model.BurgerKing;
import Model.Chowking;
import Model.Manam;
import Model.PandaExpress;
import Model.Subway;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;

public class RestaurantsController {

    @FXML
    ImageView img1, img2, img3, img4, img5;
    
    @FXML
    Button btn1, btn2, btn3, btn4, btn5;

    BurgerKing burgerking = new BurgerKing();
    Chowking chowking = new Chowking();
    Manam manam = new Manam();
    PandaExpress pandaexpress = new PandaExpress();
    Subway subway = new Subway();
    

    public void initialize() {

        burgerking.setColor("its a bit expensive but won't regret it");
        burgerking.setTaste("the worth Burgers of all time!");

        chowking.setColor("all nice and fresh and of good quality");
        chowking.setTaste("can't go wrong for a quick meal");

        manam.setColor("Bbest family restaurant");
        manam.setTaste("the price is a bit expensive");

        pandaexpress.setColor("has a long queue probably because of the hype");
        pandaexpress.setTaste("very affordable considering the amount of serving they give you, and surprisingly it is flavorful. Sarap!");

        subway.setColor("sandwiches are really goooooooooood!!!");
        subway.setTaste("the best part is, I think they're healthy.");
    }

    public void showInfo(ActionEvent event) {

        Button sourceButton = (Button) event.getSource();
        Alert alert = new Alert(AlertType.INFORMATION);

        if (sourceButton.equals(btn1)) {
            alert.setContentText("BurgerKing are " + burgerking.getColor() + " and " + burgerking.getTaste());
        }

        if (sourceButton.equals(btn2)) {
            alert.setContentText("Chowking are " + chowking.getColor() + " and " + chowking.getTaste());
        }

        if (sourceButton.equals(btn3)) {
            alert.setContentText("Manam are " + manam.getColor() + " and " + manam.getTaste());
        }

        if (sourceButton.equals(btn4)) {
            alert.setContentText("Max's are " + pandaexpress.getColor() + " but " + pandaexpress.getTaste());
        }

        if (sourceButton.equals(btn5)) {
            alert.setContentText("Romantic Baboy are " + subway.getColor() + " and " + subway.getTaste());
        }

        alert.showAndWait();

    }
}