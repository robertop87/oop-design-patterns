package chapter1.exercise1_10;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Administrator
 */
public class SummerTest {
    
    @Test
    public void testSumRangeOfNumbers() {
        
        int fromNumber = 1;
        int toNumber = 100;
        
        long sumInt1to100 = 5050;
        
        Summer s1 = new Summer();
        
        assertEquals(sumInt1to100, s1.sumRangeOfNumbers(fromNumber, toNumber));
        
        fromNumber = 100;
        toNumber = 1000;
        
        long sumInt100to1000 = 495550;
        
        assertEquals(sumInt100to1000, s1.sumRangeOfNumbers(fromNumber, toNumber));
        
    }
    
}
