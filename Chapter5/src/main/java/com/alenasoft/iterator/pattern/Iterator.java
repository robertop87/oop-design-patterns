package com.alenasoft.iterator.pattern;

/**
 * Created by roberto on 14/9/2016.
 */
public interface Iterator {
    void reset();
    boolean isDone();
    String next();
    String current();
}
