package com.alenasoft.strategy.simple;

/**
 * Created by roberto on 17/9/2016.
 */
public class Client {
    private Strategy strategy;

    public void execute() {
        if(strategy != null) {
            this.strategy.doWork();
        }
    }

    public void defineStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
