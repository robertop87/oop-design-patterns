package com.alenasoft.iterator.pattern;

/**
 * Created by roberto on 14/9/2016.
 */
public class Main {
    public static void main(String[] args) {
        // Iterator Pattern approach
        // The internal data structure is not known

        Arts arts = new Arts();
        Iterator artsIterator = arts.createIterator();
        printIterator(artsIterator);

        Science science = new Science();
        Iterator scienceIterator = science.createIterator();
        printIterator(scienceIterator);
    }

    public static void printIterator(Iterator iterator) {
        while (!iterator.isDone()) {
            System.out.println(iterator.next());
        }
    }
}
