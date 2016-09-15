package com.alenasoft.observer.simple;

/**
 * Created by roberto on 15/9/2016.
 */
public class Fan implements SimpleObserver {

    private String name;

    public Fan(String name) {
        this.name = name;
    }

    public void update() {
        System.out.println("As a Fan "+ this.name +" I am happy for news");
    }
}
