package model;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by bangu on 6/6/2017.
 */
public class Person implements Serializable{

    private String firsname;
    private String lastname;
    private String ssn;
    private Date dob;
    private char gender;

    //constructor for Person class
    public Person(String firstname, String lastname, String ssn, Date dob, char gender){
        this.firsname = firstname;
        this.lastname = lastname;
        this.ssn = ssn;
        this.dob = dob;
        this.gender = gender;
    }



    //getters for the Person class

    public String getFirsname() {
        return firsname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getSsn() {
        return ssn;
    }

    public Date getDob() {
        return dob;
    }

    public char getGender() {
        return gender;
    }

    //setters for the Person class

    public void setFirsname(String firsname) {
        this.firsname = firsname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}
