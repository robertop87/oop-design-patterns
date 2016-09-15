package com.alenasoft.observer.value;

/**
 * Created by roberto on 15/9/2016.
 */
public interface Subject {

    void register(DataObserver o);
    void unregister(DataObserver o);
    void notifyObservers(int value);
}
