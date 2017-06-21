package model;

import javafx.scene.control.DatePicker;

import java.time.LocalDate;
import java.util.List;

/**
 * Created by bangu on 6/6/2017.
 */
public class Validator {

    //validate empty required fields
    public static boolean fieldValid(String field) {
        if (field.length() > 0) {
            return true;
        }
        return false;
    }

    //vaildate the date picked
    public static boolean datePicked(LocalDate localDate) {
        if (localDate == null) {
            return false;
        }
        return true;
    }

    //checks to see if password is in the correct format
    public static boolean passValid(String pass) {
        if (pass.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[$@$!%*?&])[A-Za-z\\d$@$!%*?&]{4,}")) {
            return true;
        }
        return false;
    }

    //validates an email address
    public static boolean emailValid(String email) {
        if (email.matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$")) {
            return true;
        }
        return false;
    }

    //checks if the user already exists
    public static boolean checkUser(String username, List<User> users) {
        for (User user : users) {
            if (username.equals(user.getUsername())) {
                return false;
            }
        }
        return true;
    }


}