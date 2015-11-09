package chapter1.exercise1_19;

/**
 *
 * @author Administrator
 */
public class Adder {
    
    public double sum(double... numbers) {
        
        double sumTotal = 0;
        for (double number : numbers) {
            
            sumTotal += number;
        }
        
        return sumTotal;
    }
    
}
