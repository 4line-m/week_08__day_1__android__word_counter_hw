package com.example.alinemokfa.wordcounter;

import com.example.alinemokfa.wordcounter.models.WordCounter;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by alinemokfa on 13/11/2017.
 */

public class WordCounterTest {

    @Test
    public void testWordCounterStartsAtZero() {
        assertEquals(0, WordCounter.wordCount(" "));
    }

    @Test
    public void testWordCounterWorks(){
        assertEquals(4, WordCounter.wordCount("I love Android Studio!"));
    }
}
