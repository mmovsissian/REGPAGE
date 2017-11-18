package sample;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {


    @FXML
    Button regcard;
    @FXML
    ImageView mailcheck;
    @FXML
    TextField email;
    @FXML
    ChoiceBox country;


//    Image acc = new Image("sample/images/Accept-icon 2.png");
//    Image dec = new Image("sample/ima");


    public void initialize() {


        regcard.setOnAction(event -> {
            Parent root;
            try {
                root = FXMLLoader.load(getClass().getResource("layouts/secondpage.fxml"));
                Stage stage = new Stage();
                stage.setTitle("Other");
                stage.setScene(new Scene(root, 600, 400));
                stage.show();
//                     Hide this current window (if this is what you want)
                ((Node) (event.getSource())).getScene().getWindow().hide();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        country.setItems(FXCollections.observableArrayList(
                "Armenia", "Russia", "Usa"));

        email.setOnKeyTyped(event -> {
            if (email.getText().toString().contains("@")) {
                System.out.println("yes");;
            } else {
                System.out.println("no");
            }
        });


    }


}