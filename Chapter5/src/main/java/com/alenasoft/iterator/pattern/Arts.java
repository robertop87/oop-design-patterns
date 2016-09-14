package com.alenasoft.iterator.pattern;


/**
 * Created by roberto on 14/9/2016.
 */
public class Arts implements TopicArea {
    private String[] subjects;

    public Arts() {
        subjects = new String[2];
        subjects[0] = "Introduction";
        subjects[1] = "The Theme";
    }

    public Iterator createIterator() {
        return new ArtsIterator(this.subjects);
    }
}
