package chapter1.exercise1_13;

/**
 *
 * @author Administrator
 */
public class Greeter {
    
    String name;
    
    public Greeter(String name) {
        
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        
        this.name = name;
    }
    
    public void copyNameTo(Greeter other) {
        
        other.name = this.name;
    }
    
    public void copyLengthTo(int n) {
        
        n = name.length();
    }
    
    public void copyGreeterTo(Greeter other) {
        
        other = new Greeter(name);
    }
    
}
