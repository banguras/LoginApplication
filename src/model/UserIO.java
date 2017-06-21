package model;

import java.io.*;

/**
 * Created by bangu on 6/7/2017.
 */
public class UserIO {
    //write users onto the databse file
    public static void writeUsers(Object data) throws IOException {
        ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("users.dat"));
        output.writeObject(data);
    }

    //read users from the database file
    public static Object readUsers() throws IOException, ClassNotFoundException {
        ObjectInputStream input = new ObjectInputStream(new FileInputStream("users.dat"));
        return input.readObject();
    }
}
