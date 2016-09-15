package com.alenasoft.observer.simple;

/**
 * Created by roberto on 15/9/2016.
 */
public class Paparazzi implements SimpleObserver {
    public void update() {
        System.out.println("As a Paparazzi I will publish the dirty details");
    }
}
