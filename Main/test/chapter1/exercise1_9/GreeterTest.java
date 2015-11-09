package chapter1.exercise1_9;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Administrator
 */
public class GreeterTest {
    
    @Test
    public void testGetRoundedSquare() {
        
        int numb = 1000;
        long roundedSquare = 32;
        assertEquals(roundedSquare, new chapter1.exercise1_9.Greeter().getRoundedSquare(numb));
    }
}
