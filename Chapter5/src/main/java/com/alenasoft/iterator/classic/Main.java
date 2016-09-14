package com.alenasoft.iterator.classic;

import java.util.List;

/**
 * Created by roberto on 14/9/2016.
 */
public class Main {

    public static void main(String[] args) {
        // We need iterate use the Objects (subjects) from the data structure

        // Classic example: From here we need to know the Data Structure
        // The data structure is exposed

        // For Arts
        Arts arts = new Arts();
        // We know that arts has an static Array structure
        String[] list = arts.getSubjects();
        for ( int i=0; i < list.length; i++ ) {
            System.out.println(list[i]);
        }

        // For Science
        Science science = new Science();
        List<String> listScience = science.getSubjects();
        for ( int i=0; i < listScience.size(); i++ ) {
            System.out.println( listScience.get(i) );
        }

    }
}
