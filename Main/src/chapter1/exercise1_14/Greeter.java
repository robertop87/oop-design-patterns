package chapter1.exercise1_14;

/**
 *
 * @author Administrator
 */
public class Greeter {
    
    String name;
    
    public Greeter(String name) {
        
        this.name = name;
    }
    
    public void setName(String name) {
        
        this.name = name;
    }
    
    public String getName() {
        
        return this.name;
    }
    
    public void swapNames(Greeter other) {
        
        String thisName = this.name;
        
        this.name = other.name;
        other.name = thisName;
    }
    
}
