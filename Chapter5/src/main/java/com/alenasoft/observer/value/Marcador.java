package com.alenasoft.observer.value;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by roberto on 15/9/2016.
 */
public class Marcador implements Subject {

    private List<DataObserver> observers = new ArrayList<DataObserver>();

    public void setValue(int value) {
        this.notifyObservers(value);
    }

    public void register(DataObserver o) {
        this.observers.add(o);
    }

    public void unregister(DataObserver o) {
        this.observers.remove(o);
    }

    public void notifyObservers(int value) {
        for (DataObserver o : this.observers) {
            o.update(value);
        }
    }
}
