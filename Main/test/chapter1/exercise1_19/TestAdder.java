package chapter1.exercise1_19;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Administrator
 */
public class TestAdder {
    
    @Test
    public void testSum() {
        
        Adder a1 = new Adder();
        
        double totalSum = a1.sum(3, 2.5, -4.1);
        
        //System.out.println(totalSum);
        
        assertEquals(1.4, totalSum, 0.02);
    }
    
}
