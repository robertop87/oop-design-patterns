package chapter1.exercise1_12;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Administrator
 */
public class TestGreeter {
    
    @Test
    public void testSayHello() {
        
        Greeter g1 = new Greeter("Browser");
        
        g1.setName(null);
        
        // there isn't a pointer over this variable then null value will be
        // printed for it.
        g1.sayHello(); 
        
        
        assertEquals(null, g1.getName());
    }
}
