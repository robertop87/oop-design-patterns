package com.alenasoft.iterator.pattern;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by roberto on 14/9/2016.
 */
public class Science implements TopicArea {
    private List<String> subjects;

    public Science() {
        this.subjects = new LinkedList<String>();
        this.subjects.add("Introduction to Science");
        this.subjects.add("Basic Science");
    }

    public Iterator createIterator() {
        return new ScienceIterator(this.subjects);
    }
}
