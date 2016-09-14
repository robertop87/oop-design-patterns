package com.alenasoft.iterator.pattern;

import java.util.List;

/**
 * Created by roberto on 14/9/2016.
 */
public class ScienceIterator implements Iterator {

    private int position;
    private List<String> subjects;

    public ScienceIterator(List subjects) {
        this.subjects = subjects;
    }

    public void reset() {
        this.position = 0;
    }

    public boolean isDone() {
        return this.position >= this.subjects.size();
    }

    public String next() {
        return this.subjects.get(this.position++);
    }

    public String current() {
        return this.subjects.get(this.position);
    }
}
