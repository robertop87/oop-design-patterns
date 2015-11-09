package chapter1.exercise1_17;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Administrator
 */
public class TestGreeter {
    
    @Test
    public void testCreateGreeters() {
        
        Greeter g1 = new Greeter("Mario");
        
        g1.createGreeters("Luigui", "Mushroom", "Peach", "Browser");
        
        assertEquals(true, g1.isPrinted);
    }
    
}
