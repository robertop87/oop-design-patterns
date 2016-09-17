package com.alenasoft.strategy.value;

/**
 * Created by roberto on 17/9/2016.
 */
public class Main {

    public static void main(String[] args) {
        Client client = new Client(15, 23);

        client.setStrategy(new AddStrategy());
        System.out.println(client.execute());

        client.setStrategy(new ConcatStrategy());
        System.out.println(client.execute());
    }
}
