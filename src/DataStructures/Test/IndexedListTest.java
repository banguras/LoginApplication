package DataStructures.Test;

import DataStructures.Class.IndexedList;
import model.User;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

/**
 * Created by bangu on 6/18/2017.
 */
public class IndexedListTest {

    private User u = new User("test","555", "444", "abc", "test","kar", "bangura", "123", new Date(06/20/2017), 'M');
    //private UserTest u = new UserTest("123", "123");

    //tests the add user function
    @Test
    public void add() throws Exception {
        IndexedList<User> uq = new IndexedList<>();
        uq.add(u);
        assertEquals(1, uq.size());
    }

    //tests the remove user function
    @Test
    public void remove() throws Exception {
        IndexedList<User> uq = new IndexedList<>();
        uq.add(u);
        uq.remove(u);
        assertEquals(0, uq.size());
    }

    //test contains function
    @Test
    public void contains() throws Exception {
        IndexedList<User> uq = new IndexedList<>();
        uq.add(u);
        assertEquals(true, uq.contains(u));
    }

    //test if the array is empty
    @Test
    public void isEmpty() throws Exception {
        IndexedList<User> uq = new IndexedList<>();
        assertEquals(true, uq.isEmpty());
    }

    //tests the size of the array
    @Test
    public void size() throws Exception {
        IndexedList<User> uq = new IndexedList<>();
        assertEquals(0, uq.size());
    }

    //tests the get user method
    @Test
    public void get() throws Exception {
        IndexedList<User> uq = new IndexedList<>();
        uq.add(u);
        assertEquals(u, uq.get(0));
    }

    //tests the reset array function
    @Test
    public void reset() throws Exception {
        IndexedList<User> uq = new IndexedList<>();
        uq.add(u);
        uq.reset();
        assertEquals(0, uq.size());
    }

    //tests the get next user function
    @Test
    public void getNext() throws Exception {
        IndexedList<User> uq = new IndexedList<>();
        uq.add(u);
        User u2 = new User("test2", "555", "444", "abc", "test", "kar", "bangura", "123", new Date(06 / 20 / 2017), 'M');
        uq.add(u2);
        assertEquals(u2, uq.getNext(0));
    }

    //tests the index of function to find the index of a user in an array
    @Test
    public void indexOf() throws Exception {
        IndexedList<User> uq = new IndexedList<>();
        uq.add(u);
        assertEquals(0, uq.indexOf(u));
    }

    //tests if the user is unique
    @Test
    public void isUnique() throws Exception {
        IndexedList<User> uq = new IndexedList<>();
        uq.add(u);
        uq.add(u);
        assertEquals(false, uq.isUnique(u));
    }

}