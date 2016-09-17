package com.alenasoft.strategy.simple;

/**
 * Created by roberto on 17/9/2016.
 */
public class SayHelloStrategy implements Strategy {
    public void doWork() {
        System.out.println("This is my Strategy: Say Hello");
    }
}
