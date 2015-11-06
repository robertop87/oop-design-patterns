package chapter1.exercise1_5;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ivan
 */
public class GreeterTest {
    
    @Test
    public void testRegardsJose() {
        //fail("Hello, San Jose with tilde in the e should be used");
        String regards = "Hello, San Jos\u00e9";
        assertEquals(regards, new Greeter().regardsJose());
    }
    
}
