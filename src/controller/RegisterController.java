package controller;

import DataStructures.Class.IndexedList;
import DataStructures.Exceptions.OutofRangeException;
import javafx.scene.control.*;
import javafx.stage.FileChooser;
import model.User;
import javafx.fxml.FXML;
import model.UserDB;
import model.Validator;
import model.UserIO;

import java.io.File;
import java.io.IOException;
import java.sql.Date;



public class RegisterController {
    @FXML
    TextField firstname;
    @FXML
    TextField lastname;
    @FXML
    TextField username;
    @FXML
    TextField email;
    @FXML
    TextField phone;
    @FXML
    TextField ssn;
    @FXML
    DatePicker dob;
    @FXML
    RadioButton male;
    @FXML
    RadioButton female;
    @FXML
    TextField photo;
    @FXML
    PasswordField password;
    @FXML
    PasswordField confirmpass;
    @FXML
    Label required;

    public void submit() {


        Date datedob = null;

        if (Validator.fieldValid(firstname.getText()) == false){
            required.setText("First Name is required");
            return;
        }

        if (Validator.fieldValid(lastname.getText()) == false){
            required.setText("Last Name is required");
            return;
        }

        if (Validator.fieldValid(username.getText()) == false){
            required.setText("Usernae is required");
            return;
        }

        if (Validator.checkUser(username.getText(),UserDB.getUsers()) == false) {
            required.setText("Username " + username.getText() + "\n already exists!");
            username.clear();
            return;
        }

        if (Validator.datePicked(dob.getValue())){
            datedob =  Date.valueOf(dob.getValue());
        } else {
            required.setText("DOB is required");
            return;
        }


        char gender = ' ';
        if (male.isSelected()) {
            gender = 'M';
        } else if (female.isSelected()){
            gender = 'F';
        } else {
            required.setText("Please select gender");
            return;
        }

        if (Validator.passValid(password.getText())) {
            if (password.getText().equals(confirmpass.getText()) == false) {
                required.setText("Passwords must match");
                return;
            }

        } else {
            required.setText("Password must contain:\nlowercase, uppercase, number and special character");
            return;
        }

        if (Validator.emailValid(email.getText()) == false) {
            required.setText("Incorrect email format");
            return;
        }




        User user = new User(username.getText(), email.getText(), phone.getText(),
                password.getText(), photo.getText(), firstname.getText(), lastname.getText(), ssn.getText(), datedob, gender);
        IndexedList<User> iList = new IndexedList<>();
        try {
            iList.add(user);
        } catch (OutofRangeException e) {
            e.printStackTrace();
        }
        try {
            UserDB.getUsers().add(iList.get(0));
        } catch (OutofRangeException e) {
            e.printStackTrace();
        }
        try {
            UserIO.writeUsers(UserDB.getUsers());
        } catch (IOException e) {
            System.err.println("Cannot write UserDB to binary file!");
            e.printStackTrace();
        }
        required.setText("User added to database.");
        System.out.println(UserDB.getUsers());




    }


    public void browse() {
        FileChooser file = new FileChooser();
        file.setTitle("Open Image");
        File chosenfile = file.showOpenDialog(null);

        photo.setText(chosenfile.getPath());

    }




    public void maleClicked() {
        female.setSelected(false);
    }

    public void femaleClicked(){
        male.setSelected(false);
    }



}
