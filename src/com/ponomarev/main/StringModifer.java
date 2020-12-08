package com.ponomarev.main;
import java.util.StringJoiner;


public class StringModifer {
    
    public String reverseString (String data) {
        final String SPACE = " ";
        StringJoiner joiner = new StringJoiner(SPACE);
        String[] splittedSentence = data.split(SPACE);
        
        for (int i = 0; i < splittedSentence.length; i++) {
            char[] word = getWordByIndex(splittedSentence, i);
            joiner.add(toReverseWordIgnoreNonAlphabetic(word));
        }
        return joiner.toString();
    }
    
    
    private char[] getWordByIndex(String[] sentenceArray, int index) {
        return sentenceArray[index].toCharArray();
    }
    
    
    private char[] swapSymbols(char[] symbols, int leftIndex, int rightIndex) {
        char temporaryIndex = symbols[leftIndex];
        symbols[leftIndex] = symbols[rightIndex];
        symbols[rightIndex] = temporaryIndex;
        return symbols;
    }
    
    private String toReverseWordIgnoreNonAlphabetic(char[] word) {
       int rightIndex = word.length - 1, leftIndex = 0;
       while (leftIndex < rightIndex) {
           if (!Character.isAlphabetic(word[leftIndex])) {
               leftIndex++;
           }
           else if (!Character.isAlphabetic(word[rightIndex])) {
               rightIndex--;
           }
           else {
               word = swapSymbols(word, leftIndex, rightIndex);
               leftIndex++;
               rightIndex--;
           }
       }
       return new String(word);
    }
}