package controller;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import model.UserDB;
import template.Register;

import java.awt.*;
import java.io.IOException;

public class LoginController {
    @FXML
    TextField username;
    @FXML
    PasswordField password;

    public void authenticateUser() {

        for(int i=0; i<UserDB.getUsers().size(); i++) {
            if (username.getText().equals(UserDB.getUsers().get(i).getUsername())) {
                if (password.getText().equals(UserDB.getUsers().get(i).getPassword()))
                System.out.println("Welcome " +username.getText());

            }
        }

    }

    public void openSignUpPage() throws IOException {
        System.out.println("Opening Register Form");
        new Register();

    }

}
