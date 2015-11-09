package chapter1.exercise1_11;

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
    
    public void sayHello() {
        
        System.out.printf("Hello my name is: \t %s", name);
    }
    
}
