package com.alenasoft.strategy.value;

/**
 * Created by roberto on 17/9/2016.
 */
public class AddStrategy implements Strategy {
    public String doWork(int value1, int value2) {
        System.out.println("My strategy is add numbers");
        String result = String.format("%d + %d = %d", value1, value2, (value1+value2));
        return result;
    }
}
