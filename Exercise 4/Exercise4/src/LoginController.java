import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class LoginController {

    @FXML
    TextField myTextField;

    @FXML
    PasswordField myPasswordField;

    @FXML
    Button myButton;

    public void login(ActionEvent event) throws IOException{


        // get input in my text field
        String username = myTextField.getText();

        //get input in my password field
        String password = myPasswordField.getText();

        if (username.equals("Kade") && password.equals("Cutie")) {

            Parent root = FXMLLoader.load(getClass().getResource("Scene.fxml"));
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        }
    }

}
