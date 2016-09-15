package com.alenasoft.observer.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * The Artist is the Subject for Observer Pattern
 * Created by roberto on 15/9/2016.
 */
public class Artist implements Subject {
    private List<SimpleObserver> fans;

    public Artist() {
        this.fans = new ArrayList<SimpleObserver>();
    }

    public void makeAnAction() {
        System.out.println("Artist made something special");
        this.notifyObservers();
    }

    public void attach(SimpleObserver o) {
        this.fans.add(o);
    }

    public void remove(SimpleObserver o) {
        this.fans.remove(o);
    }

    public void notifyObservers() {
        for (SimpleObserver fan : this.fans) {
            fan.update();
        }
    }
}
