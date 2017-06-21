package template;/**
 * Created by bangu on 6/6/2017.
 */

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Register {

    //open stage to register
    public Register() throws IOException {
        Stage registerStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("Register.fxml"));
        registerStage.setTitle("Register New User");
        registerStage.setScene(new Scene(root, 315, 625));
        registerStage.show();


    }
}
