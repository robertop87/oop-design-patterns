package chapter1.exercise1_18;

import java.util.ArrayList;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Administrator
 */
public class TestGreeter {
    
    @Test
    public void testValues() {
        String numb = 2 + 2 + "2";
        
        assertEquals("42", numb);
        
        ArrayList<String> countries = new ArrayList<String>();
        countries.add("Argentina");
        countries.add("Bolivia");
        countries.add("Chile");
        countries.add("Ecuador");
        
        String country = "" + countries;
        
        assertEquals("" + countries, country); // TODO
        
        String regard = "Hello " + new Greeter("World");
        
        //assertEquals("Hello chapter1.exercise1_18.Greeter@", regard);
    }
}
