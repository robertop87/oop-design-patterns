package chapter1.exercise1_6;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Administrator
 */
public class GreeterTest {
    
    @Test
    public void testGetGreekLetter() {
        String pi = "π";
        assertEquals(pi, new chapter1.exercise1_6.Greeter().getGreekLetter());
    }
    
}
