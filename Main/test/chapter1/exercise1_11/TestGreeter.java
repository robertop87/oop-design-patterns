package chapter1.exercise1_11;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Administrator
 */
public class TestGreeter {
    
    @Test
    public void testSetName() {
        
        Greeter g1 = new Greeter("Mario");
        Greeter g2 = new Greeter("Luigui");
        
        g2.setName("Warrio");
        g1.sayHello();
        
        assertEquals("Mario", g1.getName());
        
        // reference to g2 is a complete different object, therefore setName
        // method doesn't change name value for g1
        assertEquals("Warrio", g2.getName());
    }
    
}
