package com.alenasoft.strategy.value;

/**
 * Created by roberto on 17/9/2016.
 */
public class ConcatStrategy implements Strategy {
    public String doWork(int value1, int value2) {
        System.out.println("My strategy is concat numbers");
        String result = String.format("%d CONCAT %d = %d%d", value1, value2, value1, value2);
        return result;
    }
}
