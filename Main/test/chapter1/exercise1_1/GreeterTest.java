package chapter1.exercise1_1;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author roberto_perez
 */
public class GreeterTest {

    @Test
    public void testSayGoodBye() {
        Greeter greeter = new Greeter();
        String expected = "Good Bye";
        assertEquals(expected, greeter.sayGoodBye());
    }
    
}
