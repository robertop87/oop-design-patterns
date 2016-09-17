package com.alenasoft.strategy.value;

/**
 * Created by roberto on 17/9/2016.
 */
public class Client {

    private int value1;
    private int value2;
    private Strategy strategy;

    public Client(int value1, int value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public String execute() {
        return this.strategy.doWork(this.value1, this.value2);
    }
}
