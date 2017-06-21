package template;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.UserDB;
import model.UserIO;
import model.User;

import java.io.IOException;
import java.util.ArrayList;

public class Login extends Application {

    //open stage for Login page
    @Override
    public void start(Stage primaryStage) throws Exception{
        loadUserDB();
        Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
        primaryStage.setTitle("Login");
        primaryStage.setScene(new Scene(root, 300, 300));
        primaryStage.show();
    }

    //add user to the databse
    public void loadUserDB() {
        try {
            UserDB.setUsers((ArrayList<User>) UserIO.readUsers());
        } catch (IOException e) {
            System.err.println("Fail to open/read UserDB.dat file.");
        } catch (ClassNotFoundException e) {
            System.err.println("Fail reading and casting the UserDB due to User class issue.");
        }
    }


    public static void main(String[] args) {
        launch(args);
    }
}
