package com.alenasoft.observer.simple;

/**
 * Created by roberto on 15/9/2016.
 */
public class Main {
    public static void main(String[] args) {
        Artist artist = new Artist();

        SimpleObserver fanR = new Fan("Roberto");
        SimpleObserver fanB = new Fan("Beto");
        SimpleObserver fanJ = new Fan("Juan");

        SimpleObserver paparazzi = new Paparazzi();

        artist.attach(fanR);
        artist.attach(fanB);
        artist.attach(fanJ);
        artist.attach(paparazzi);

        System.out.println("First Action -------------");
        artist.makeAnAction();

        artist.remove(paparazzi);

        System.out.println("Second Action -------------");
        artist.makeAnAction();
    }
}
