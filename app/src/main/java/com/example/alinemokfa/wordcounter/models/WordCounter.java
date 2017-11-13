package com.example.alinemokfa.wordcounter.models;

/**
 * Created by alinemokfa on 13/11/2017.
 */

public class WordCounter {


    public static int wordCount(String inputText) {
        String[] words = inputText.split(" ");
        return words.length;
    }
}
