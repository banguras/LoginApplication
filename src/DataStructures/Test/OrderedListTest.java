package DataStructures.Test;

import DataStructures.Class.OrderedList;
import DataStructures.Class.OrderedList;
import DataStructures.Exceptions.OutofRangeException;
import model.User;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

/**
 * Created by bangu on 6/20/2017.
 */
public class OrderedListTest {

    //creates a test user
    User a = new User("test","555", "444", "abc", "test","kar", "bangura", "123", new Date(06/20/2017), 'M');

    //test the add user fuction
    @Test
    public void add() throws Exception {
        OrderedList<User> uq = new OrderedList<>();
        uq.add(a);
        assertEquals(1, uq.size());
    }

    //tests the remove user function
    @Test
    public void remove() throws Exception {
        OrderedList<User> uq = new OrderedList<>();
        uq.add(a);
        uq.remove(a);
        assertEquals(0, uq.size());
    }

    //test contains function
    @Test
    public void contains() throws Exception {
        OrderedList<User> uq = new OrderedList<>();
        uq.add(a);
        assertEquals(true, uq.contains(a));
    }

    //test if the array is empty
    @Test
    public void isEmpty() throws Exception {
        OrderedList<User> uq = new OrderedList<>();
        assertEquals(true, uq.isEmpty());
    }

    //tests the size of the array
    @Test
    public void size() throws Exception {
        OrderedList<User> uq = new OrderedList<>();
        assertEquals(0, uq.size());
    }

    //tests the get user method
    @Test
    public void get() throws Exception {
        OrderedList<User> uq = new OrderedList<>();
        uq.add(a);
        assertEquals(a, uq.get(0));
    }


    //tests the reset array function
    @Test
    public void reset() throws Exception {
        OrderedList<User> uq = new OrderedList<>();
        uq.add(a);
        uq.reset();
        assertEquals(0, uq.size());
    }

    //tests the get next user function
    @Test
    public void getNext() throws Exception {
        OrderedList<User> uq = new OrderedList<>();
        uq.add(a);
        User b = new User("test","555", "444", "abc", "test","kar", "bangura", "123", new Date(06/20/2017), 'M');
        uq.add(b);
        assertEquals(b, uq.getNext(0));
    }

    //tests the index of function to find the index of a user in an array
    @Test
    public void indexOf() throws Exception {
        OrderedList<User> uq = new OrderedList<>();
        uq.add(a);
        assertEquals(0, uq.indexOf(a));
    }

    //tests if the user is unique
    @Test
    public void isUnique() throws Exception {
        OrderedList<User> uq = new OrderedList<>();
        uq.add(a);
        uq.add(a);
        assertEquals(false, uq.isUnique(a));
    }

    //tests the sorting functionality
    @Test
    public void sort() throws OutofRangeException {
        OrderedList<User> uq = new OrderedList<>();
        uq.add(a);
        User b = new User("abc","111", "213", "def", "test2","name", "last", "999", new Date(06/20/2017), 'F');
        uq.add(b);
        assertEquals(b, uq.get(1));
    }

}