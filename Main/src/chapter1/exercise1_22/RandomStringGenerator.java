package chapter1.exercise1_22;

import java.util.ArrayList;
import javax.media.jai.util.Range;

/**
 *
 * @author ivan
 */
public class RandomStringGenerator {
    
    ArrayList<AlphabetRange> ranges = new ArrayList<>();
    
    public void addRange(char init, char fin) {
        
        ranges.add(new AlphabetRange(Character.class, init, fin));
    }
    
    public String nextString(int numbChars) {
        
        StringBuilder sb = new StringBuilder();
        
        for (AlphabetRange range : ranges) {
            sb.append(String.format("String for range: %s\n", 
                    range.getNewString(numbChars)));
            
        }
        
        return new String(sb);
        
    }
}
