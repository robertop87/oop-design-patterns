package com.alenasoft.iterator.pattern;

import java.util.List;

/**
 * Created by roberto on 14/9/2016.
 */
public class ArtsIterator implements Iterator {

    private int position;
    private String[] subjects;

    public ArtsIterator(String[] subjects) {
        this.subjects = subjects;
        this.position = 0;
    }

    public void reset() {
        this.position = 0;
    }

    public boolean isDone() {
        return this.position >= this.subjects.length;
    }

    public String next() {
        return this.subjects[this.position++];
    }

    public String current() {
        return this.subjects[this.position];
    }
}
