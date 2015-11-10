package cahpter1.exercise1_20;

import chapter1.exercise1_20.DataAnalyzer;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Administrator
 */
public class TestDataAnalyzer {
    
    @Test
    public void testGetMinimum() {
        String path = "C:\\Users\\Administrator\\Documents\\NetBeansProjects\\oop-design-patterns\\Main\\test\\resources\\numbersFile.txt";
        DataAnalyzer da1 = new DataAnalyzer(path);
        
        double min = -6.2;
        assertEquals(min, da1.getMinimum(), 0.02);
    }
    
    @Test
    public void TestGetMaximum() {
        String path = "C:\\Users\\Administrator\\Documents\\NetBeansProjects\\oop-design-patterns\\Main\\test\\resources\\numbersFile.txt";
        DataAnalyzer da1 = new DataAnalyzer(path);
        
        double max = 33;
        assertEquals(max, da1.getMaximum(), 0.02);
    }
    
    @Test
    public void TestGetAverage() {
        String path = "C:\\Users\\Administrator\\Documents\\NetBeansProjects\\oop-design-patterns\\Main\\test\\resources\\numbersFile.txt";
        DataAnalyzer da1 = new DataAnalyzer(path);
        
        double average = 5.54167;
        assertEquals(average, da1.getAverage(), 0.02);
    }
    
}
