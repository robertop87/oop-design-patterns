package com.alenasoft.strategy.simple;

import java.util.Random;

/**
 * Created by roberto on 17/9/2016.
 */
public class Main {

    public static void main(String[] args) {
        Random random = new Random();

        Client client = new Client();
        // We will evaluate the situation is value%2 = 0 then we apply Hello Strategy
        for (int i = 0; i<10; i++) {
            client.defineStrategy(
                    random.nextInt(15000)%2 == 0
                            ? new SayHelloStrategy()
                            : new SayByeStrategy());

            client.execute();
        }

    }
}
