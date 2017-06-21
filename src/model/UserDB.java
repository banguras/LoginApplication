package model;

import java.util.ArrayList;

/**
 * Created by bangu on 6/7/2017.
 */
public class UserDB {

    //creates an arraylist of users
    private static ArrayList <User> users = new ArrayList<User>();

    //gets users from the arraylist
    public static ArrayList<User> getUsers() {return users;}

    //adds users to the arrylist
    public static void setUsers (ArrayList<User> users) { UserDB.users = users;}
}
