package DataStructures.Test;

import DataStructures.Class.BoundedStack;

import static org.junit.Assert.*;

/**
 * Created by bangu on 6/16/2017.
 */
public class BoundedStackTest {

    //create a new UserTest u
    UserTest u = new UserTest("123","Trung");

    //tests the push function to add users
    @org.junit.Test
    public void push() throws Exception {
        BoundedStack<UserTest> bs = new BoundedStack<>(2);
        bs.push(u);
        assertEquals(1, bs.size());
    }

    //tests the pop function to remove users
    @org.junit.Test
    public void pop() throws Exception {
        BoundedStack<UserTest> bs = new BoundedStack<>(2);
        bs.push(u);
        assertEquals(1, bs.size());
        bs.pop();
        assertEquals(0, bs.size());
    }

    //tests the top function to return the top user
    @org.junit.Test
    public void top() throws Exception {
        BoundedStack<UserTest> bs = new BoundedStack<>(2);
        bs.push(u);
        assertEquals(u, bs.top());
    }

    //tests to see if an array is empty
    @org.junit.Test
    public void isEmpty() throws Exception {
        BoundedStack<UserTest> bs = new BoundedStack<>(2);
        assertEquals(0, bs.size());
        bs.push(u);
        bs.pop();
        assertEquals(0, bs.size());
    }

    //tests to see if the array is empty
    @org.junit.Test
    public void isFull() throws Exception {
        BoundedStack<UserTest> bs = new BoundedStack<>(2);
        bs.push(u);
        bs.push(u);
        assertEquals(true, bs.isFull());
    }

    //tests the size of an array
    @org.junit.Test
    public void size() throws Exception {
        BoundedStack<UserTest> bs = new BoundedStack<>(2);
        assertEquals(0, bs.size());
        bs.push(u);
        bs.pop();
        assertEquals(0, bs.size());
    }

}