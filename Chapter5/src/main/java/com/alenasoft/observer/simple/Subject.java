package com.alenasoft.observer.simple;

import java.util.Observer;

/**
 * Created by roberto on 15/9/2016.
 */
public interface Subject {

    void attach(SimpleObserver o);
    void remove(SimpleObserver o);
    void notifyObservers();
}
