package DataStructures.Test;

import DataStructures.Class.UnboundedQueue;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by bangu on 6/17/2017.
 */
public class UnboundedQueueTest {

    //create UserTest u
    UserTest u = new UserTest("13", "Sahid");

    //test enqueue function to add users
    @Test
    public void enqueue() throws Exception {
        UnboundedQueue<UserTest> uq = new UnboundedQueue<>();
        uq.enqueue(u);
        assertEquals(1, uq.size());
    }

    //test if user is Unique
    @Test
    public void isUnique() {
        UnboundedQueue<UserTest> uq = new UnboundedQueue<>();
        assertEquals(true, uq.isUnique(u));
    }


    //test dequeue method to remove users
    @Test
    public void dequeue() throws Exception {
        UnboundedQueue<UserTest> uq = new UnboundedQueue<>();
        uq.enqueue(u);
        UserTest ut = uq.dequeue();
        assertEquals(0, uq.size());
    }

    //test isEmpty function
    @Test
    public void isEmpty() throws Exception {
        UnboundedQueue<UserTest> uq = new UnboundedQueue<>();
        uq.enqueue(u);
        uq.dequeue();
        assertEquals(0, uq.size());
    }

    //test array size function
    @Test
    public void size() throws Exception {
        UnboundedQueue<UserTest> uq = new UnboundedQueue<>();
        uq.enqueue(u);
        assertEquals(1, uq.size());
    }

}