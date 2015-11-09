/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter1.exercise1_10;

/**
 *
 * @author Administrator
 */
public class Summer {
    
    public long sumRangeOfNumbers(int fromNumb, int toNumb) {
        
        long result = 0;
        for (int i = fromNumb; i < toNumb ; i++) {
            System.out.printf(" %d + %d = \t", fromNumb, i + 1);
            result = fromNumb + i + 1;
            fromNumb = (int)result;
            System.out.println(result);
        }
        
        return result;
    }
    
}
