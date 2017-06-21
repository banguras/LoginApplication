package model;

/**
 * Created by bangu on 6/6/2017.
 */
import java.io.Serializable;
import java.util.Date;

public class User extends Person implements Serializable, Comparable<User> {
    private String username;
    private String email;
    private String phone;
    private String password;
    private String photo;

    //constructor for User
    public User(String username, String email, String phone, String password, String photo, String firstname,
                String lastname, String ssn, Date dob, char gender) {
        super(firstname, lastname, ssn, dob, gender);
        this.username = username;
        this.email = email;
        this.phone = phone;
        this.password = password;
        this.photo = photo;
    }

    //set user
    public void setUsername(String username) {
        this.username = username;
    }

    //set email
    public void setEmail(String email) {
        this.email = email;
    }

    //set phone
    public void setPhone(String phone) {
        this.phone = phone;
    }

    //set password
    public void setPassword(String password) {
        this.password = password;
    }

    //set photo
    public void setPhoto(String photo) {
        this.photo = photo;
    }

    //get username
    public String getUsername() {
        return username;
    }

    //get email
    public String getEmail() {
        return email;
    }

    //get phone
    public String getPhone() {
        return phone;
    }

    //get password
    public String getPassword() {
        return password;
    }

    public String getPhoto() {
        return photo;
    }

    //compares username and email
    @Override
    public int compareTo(User u) {
       int result = this.username.compareTo(u.username);
       if (result == 0 ) {
           return this.email.compareTo(u.email);
       }
       else {
           return result;
       }
    }
}
