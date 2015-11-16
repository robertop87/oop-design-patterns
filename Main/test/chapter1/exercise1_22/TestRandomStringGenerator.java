package chapter1.exercise1_22;

import org.junit.Test;

/**
 *
 * @author ivan
 */
public class TestRandomStringGenerator {
    
    @Test
    public void testNextString() {
        
        RandomStringGenerator rsg = new RandomStringGenerator();
        rsg.addRange('a', 'e');
        rsg.addRange('B', 'G');
        
        
        System.out.println(rsg.nextString(10));
        
    }
    
}
