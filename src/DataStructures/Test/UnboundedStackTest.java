package DataStructures.Test;

import DataStructures.Class.UnboundedStack;

import static org.junit.Assert.*;

/**
 * Created by bangu on 6/16/017.
 */
public class UnboundedStackTest {

    //create a new UserTest with user u
    UserTest u = new UserTest("13","Trung");

    //test push function
    @org.junit.Test
    public void push() throws Exception {
        UnboundedStack<UserTest> bs = new UnboundedStack<>();
        bs.push(u);
        assertEquals(1, bs.size());
    }

    //test pop function
    @org.junit.Test
    public void pop() throws Exception {
        UnboundedStack<UserTest> bs = new UnboundedStack<>();
        bs.push(u);
        assertEquals(1, bs.size());
        bs.pop();
        assertEquals(0, bs.size());
    }

    //test top function to get top element
    @org.junit.Test
    public void top() throws Exception {
        UnboundedStack<UserTest> bs = new UnboundedStack<>();
        bs.push(u);
        assertEquals(u, bs.top());
    }

    //test fuction if array is empty
    @org.junit.Test
    public void isEmpty() throws Exception {
        UnboundedStack<UserTest> bs = new UnboundedStack<>();
        assertEquals(0, bs.size());
        bs.push(u);
        bs.pop();
        assertEquals(0, bs.size());
    }

    //check size
    @org.junit.Test
    public void size() throws Exception {
        UnboundedStack<UserTest> bs = new UnboundedStack<>();
        assertEquals(0, bs.size());
        bs.push(u);
        bs.pop();
        assertEquals(0, bs.size());
    }

}