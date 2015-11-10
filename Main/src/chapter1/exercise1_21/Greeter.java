package chapter1.exercise1_21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
    
    public void setNameByConsole() {
        
        System.out.print("What's your name? (Peach): ");
        
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
            setName(br.readLine());
        } catch(IOException e) {
            
            e.printStackTrace();
        }
        
    }
    
    public String sayHello() {
        
        return String.format("Hello, %s", this.getName());
    }
    
}
