package com.alenasoft.iterator.classic;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by roberto on 14/9/2016.
 */
public class Science {
    private List<String> subjects;

    public Science() {
        this.subjects = new LinkedList<String>();
        this.subjects.add("Introduction to Science");
        this.subjects.add("Basic Science");
    }

    public List<String> getSubjects() {
        return subjects;
    }
}
