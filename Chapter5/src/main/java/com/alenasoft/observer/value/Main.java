package com.alenasoft.observer.value;

/**
 * Created by roberto on 15/9/2016.
 */
public class Main {

    public static void main(String[] args) {
        Marcador marcador = new Marcador();

        marcador.register(new DataObserver() {
            public void update(int value) {
                System.out.println("The pow 2 is: " + Math.pow(value,2));
            }
        });

        marcador.register(new DataObserver() {
            public void update(int value) {
                System.out.println("I am happy with the value " + value);
            }
        });

        marcador.setValue(5);
    }
}
