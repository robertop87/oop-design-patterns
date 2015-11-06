package main;

import org.junit.Test;
import static org.junit.Assert.*;
import chapter1.exercise1_1.Greeter;

/**
 *
 * @author roberto_perez
 */
public class MainTest {
    
    public MainTest() {
    }

    @Test
    public void testSomeMethod() {
        //fail("The test case is a prototype.");
        String regard = "Good Bye";
        assertEquals(regard, new Greeter().sayGoodBye());
    }
    
}
