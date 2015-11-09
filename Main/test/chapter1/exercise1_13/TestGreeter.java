package chapter1.exercise1_13;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Administrator
 */
public class TestGreeter {
    
    @Test
    public void testGreeterMethods() {
        
        Greeter g1 = new Greeter("Yoshi");
        Greeter g2 = new Greeter("DonkeyKong");
        
        g1.setName("Peach");
        
        assertEquals("Peach", g1.getName());
        
        g1.copyNameTo(g2);
        
        assertEquals("Peach", g2.getName());
        
        int lengthCopied = 15;
        g1.copyLengthTo(lengthCopied);
        
        assertEquals(15, lengthCopied);
        
        Greeter g3 = new Greeter("Paco");
        g1.copyGreeterTo(g3);
        
        assertEquals("Paco", g3.getName());
        
    }
    
}
