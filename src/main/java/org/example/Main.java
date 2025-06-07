package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Provide a word to analyze: ");
        String word = scanner.nextLine();
        System.out.println("Your word has " + WordAnalyzer.countConsonants(word) + " consonants and " + WordAnalyzer.countVowels(word)+ " vowels");
    }
}