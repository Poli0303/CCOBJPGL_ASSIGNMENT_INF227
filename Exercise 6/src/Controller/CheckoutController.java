package Controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

public class CheckoutController implements Initializable {

    @FXML
    Pane pane1, pane2, pane3, pane4;

    @FXML
    VBox myvbox;

    @FXML
    Label name1, name2, name3, name4, price1, price2, price3, price4, total;

    @FXML
    ImageView img1, img2, img3, img4;

    @FXML
    private ChoiceBox<String> choicebox1, choicebox2, choicebox3, choicebox4;

    private String[] quantity = { "1", "2", "3" };

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        name1.setText(HomeController.blamp.getProductName());
        price1.setText(Double.toString(HomeController.blamp.getProductPrice()));
        Image bedroomLamp = new Image(HomeController.blamp.getProductImage());
        img1.setImage(bedroomLamp);

        name2.setText(HomeController.clamp.getProductName());
        price2.setText(Double.toString(HomeController.clamp.getProductPrice()));
        Image ceilinglamp = new Image(HomeController.clamp.getProductImage());
        img2.setImage(ceilinglamp);

        name3.setText(HomeController.wlamp.getProductName());
        price3.setText(Double.toString(HomeController.wlamp.getProductPrice()));
        Image walllamp = new Image(HomeController.wlamp.getProductImage());
        img3.setImage(walllamp);

        name4.setText(HomeController.tlamp.getProductName());
        price4.setText(Double.toString(HomeController.tlamp.getProductPrice()));
        Image tablelamp = new Image(HomeController.tlamp.getProductImage());
        img4.setImage(tablelamp);

        // Set default quantities in choicebox to 1
        choicebox1.setValue("1");
        choicebox2.setValue("1");
        choicebox3.setValue("1");
        choicebox4.setValue("1");

        // Insert quantity array to choicebox
        choicebox1.getItems().addAll(quantity);
        choicebox2.getItems().addAll(quantity);
        choicebox3.getItems().addAll(quantity);
        choicebox4.getItems().addAll(quantity);

        // Add event handler on all choiceboxes
        choicebox1.setOnAction(this::computeTotal);
        choicebox2.setOnAction(this::computeTotal);
        choicebox3.setOnAction(this::computeTotal);
        choicebox4.setOnAction(this::computeTotal);

        // Set total initial amount
        double totalInitialAmount = 0.00;
        if (HomeController.clamp.getProductStatus() || HomeController.blamp.getProductStatus() || HomeController.wlamp.getProductStatus() || HomeController.tlamp.getProductStatus()) {
            totalInitialAmount = Double.parseDouble(choicebox1.getValue()) * HomeController.blamp.getProductPrice() +
            + Double.parseDouble(choicebox2.getValue()) * HomeController.clamp.getProductPrice()
            + Double.parseDouble(choicebox3.getValue()) * HomeController.wlamp.getProductPrice()
            + Double.parseDouble(choicebox4.getValue()) * HomeController.tlamp.getProductPrice();
        }
     
        // Display total initial amount in total label
        total.setText(Double.toString(totalInitialAmount));
    }

    public void addItem(Pane pane) {
        myvbox.getChildren().add(pane);
    }

    public void computeTotal(ActionEvent event) {

        double totalAmount = 0;
        double item1Amount = 0;
        double item2Amount = 0;
        double item3Amount = 0;
        double item4Amount = 0;

        ChoiceBox source = (ChoiceBox) event.getSource();

        // If product is chosen, compute item amount
        if (HomeController.blamp.getProductStatus()) {

            double qty = Double.parseDouble(choicebox1.getValue());
            item1Amount = HomeController.blamp.getProductPrice() * qty;

            if (source == choicebox1) {
                item1Amount = HomeController.blamp.getProductPrice() * qty;
            }
        }

        if (HomeController.clamp.getProductStatus()) {

            double qty = Double.parseDouble(choicebox2.getValue());
            item2Amount = HomeController.clamp.getProductPrice() * qty;

            if (source == choicebox2) {
                item2Amount = HomeController.clamp.getProductPrice() * qty;
            }
        }

        if (HomeController.wlamp.getProductStatus()) {

            double qty = Double.parseDouble(choicebox3.getValue());
            item3Amount = HomeController.wlamp.getProductPrice() * qty;

            if (source == choicebox3) {
                item3Amount = HomeController.wlamp.getProductPrice() * qty;
            }
        }

        if (HomeController.tlamp.getProductStatus()) {

            double qty = Double.parseDouble(choicebox4.getValue());
            item4Amount = HomeController.tlamp.getProductPrice() * qty;

            if (source == choicebox4) {
                item4Amount = HomeController.tlamp.getProductPrice() * qty;
            }
        }

        // Compute total amount for all items chosen
        totalAmount = item1Amount + item2Amount + item3Amount + item4Amount;
        
        // Display total amount in total label
        total.setText(Double.toString(totalAmount));
    }
}