package chapter1.exercise1_22;

import java.util.LinkedList;
import java.util.Random;
import javax.media.jai.util.Range;

/**
 *
 * @author ivan
 */
public class AlphabetRange extends Range {
    
    public  int     rangeLenght;
    private final   String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    private boolean isUpperCase     = false;
    
    private char    initRange;
    private char    endRange;

    public AlphabetRange(Class type, Comparable cmprbl, Comparable cmprbl1) {
        super(type, cmprbl, cmprbl1);
        
        if(Character.isUpperCase((char)cmprbl) &&
           Character.isUpperCase((char)cmprbl1)) {
            isUpperCase = true;
        }
        
        initRange = Character.toLowerCase((char)cmprbl);
        endRange = Character.toLowerCase((char)cmprbl1);
        
        rangeLenght = getRangeLenght(initRange, endRange);
    }

    private int getRangeLenght(Character charInit, Character charEnd) {
        
        return getPosition(charEnd) - getPosition(charInit) + 1;
    }

    private int getPosition(Character charPosition) {
        char[]  charArray   = ALPHABET.toCharArray();
        int     position    = 0;
        
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == charPosition) {
                position = i;
                break;
            }    
        }
        
        return position;
    }
    
    public String getNewString(int stringLenght) {
        char[] charArray                = ALPHABET.toCharArray();
        LinkedList<Character> newString = new LinkedList<>();
        int initPosition                = getPosition(initRange);
        int endPosition                 = getPosition(endRange);
        
        for (int i = 0; i < charArray.length; i++) {
            if ((i >= initPosition) && (i <= endPosition)) {
                newString.add(charArray[i]);
            } else if (i > endPosition) {
                break;
            }
        }
        
        return getMixedString(newString, stringLenght);
    }

    private String getMixedString(LinkedList<Character> newString, int stringLenght) {
        
        char[] newCharString = new char[stringLenght];
        int randomInt = 0;
        
        for (int i = 0; i < stringLenght; i++) {
            randomInt = (int)(Math.random() * newString.size());
         
            newCharString[i] = newString.get(randomInt);
        }
        
        if (isUpperCase) {
            return new String(newCharString).toUpperCase();
        } else {
            return new String(newCharString);
        }
    }

}
