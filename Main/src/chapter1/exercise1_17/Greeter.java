package chapter1.exercise1_17;

/**
 *
 * @author Administrator
 */
public class Greeter {
    
    String name;
    boolean isPrinted = false;
    
    public Greeter(String name) {
        
        this.name = name;
    }
    
    public void setName(String name) {
        
        this.name = name;
    }
    
    public String getName() {
        
        return this.name;
    }
    
    public void createGreeters(String... greeterName) {
        
        for (String name : greeterName) {
            new Greeter(name).sayHello();
            
        }
        
        isPrinted = true;
    }
    
    public void sayHello(){
        
        System.out.printf("Hello, %s!\n", this.name);
    }
    
}
