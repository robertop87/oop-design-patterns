package chapter1.exercise1_21;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Administrator
 */
public class TestGreeter {
    
    @Test
    public void testSetNameByConsole() {
        
        Greeter g1 = new Greeter("Daisy");
        
        g1.setNameByConsole();
        String newName = "Peach";
        
        assertEquals(newName, g1.getName());    //TODO
    }
    
}
