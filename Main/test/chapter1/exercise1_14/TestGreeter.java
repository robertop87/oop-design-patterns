package chapter1.exercise1_14;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Administrator
 */
public class TestGreeter {
    
    @Test
    public void testSwapNames() {
        
        Greeter g1 = new Greeter("Koopa");
        Greeter g2 = new Greeter("Mushroom");
        
        g1.swapNames(g2);
        
        assertEquals("Mushroom", g1.name);
        assertEquals("Koopa", g2.name);
        
    }
    
}
