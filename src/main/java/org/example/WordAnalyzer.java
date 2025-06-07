package org.example;

import java.util.Arrays;


public class WordAnalyzer {

    private static final Character[] VOWELS = {'a', 'e', 'i', 'o', 'u'};

    public static int countVowels(String word){
        int counter = 0;
        word = word.toLowerCase();
        for(char letter : word.toCharArray()){
            if( Arrays.asList(VOWELS).contains(letter)) counter++;
        }
        return counter;
    }

    public static int countConsonants(String word){
        return word.length() - countVowels(word);
    }

}
