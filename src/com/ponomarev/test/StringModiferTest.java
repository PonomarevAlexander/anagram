package com.ponomarev.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.ponomarev.main.*;

public class StringModiferTest {

    StringModifer sm;
    private static final String ONLY_LETTER = "qwerty asdfgh zxcvbn";
    private static final String ONLY_LETTER_REVERSED ="ytrewq hgfdsa nbvcxz";
    private static final String ONLY_DIGITS = "1234 567 89 0";
    private static final String ONLY_DIGITS_REVERSED = "1234 567 89 0";
    private static final String ONLY_SPEC_SYMBOLS = "!@#$ %^& *( )";
    private static final String ONLY_SPEC_SYMBOLS_REVERSED = "!@#$ %^& *( )";
    private static final String LETTERS_AND_SPEC_SYMBOLS = "q!w@er#ty$ %asd^fg&h z*(xcvb{n";
    private static final String LETTERS_AND_SPEC_SYMBOLS_REVERSED = "y!t@re#wq$ %hgf^ds&a n*(bvcx{z";
    private static final String LETTERS_AND_DIGITS = "q1we2rt3y 4as5df6gh 7zxc8vb90n";
    private static final String LETTERS_AND_DIGITS_REVERSED = "y1tr2ew3q 4hg5fd6sa 7nbv8cx90z";
    private static final String DIGITS_AND_SPEC_SYMBOLS = "12!@34# 56%^7 ^8&9 *0";
    private static final String DIGITS_AND_SPEC_SYMBOLS_REVERSED = "12!@34# 56%^7 ^8&9 *0";
    private static final String LETTERS_AND_DIGITS_AND_SPEC_SYMBOLS = "#q1w@e2rt%^^&3y 4as5%*df6&*gh 7z*(xc8vb9**0n";
    private static final String LETTERS_AND_DIGITS_AND_SPEC_SYMBOLS_REVERSED = "#y1t@r2ew%^^&3q 4hg5%*fd6&*sa 7n*(bv8cx9**0z";
    private static final String EMPTY_STRING = "";
    private static final String EMPTY_STRING_REVERSED = "";
    private static final String NULL_EXCEPTION_MESSEGE = "Wrong argument, NULL aren't allowed!!!";
    
    @Before
    public void initObject() {
        sm = new StringModifer();
    }
    
    @Test
    public void toReverseStringConsistingOfNullTest() {
        Throwable exception = assertThrows(IllegalArgumentException.class, 
                () -> {sm.reverseString(null);});
        assertEquals(NULL_EXCEPTION_MESSEGE, exception.getMessage());
    }
    
    @Test
    public void toReverseStringConsistingOfEmptyStringTest() {
        String actual = sm.reverseString(EMPTY_STRING);
        assertEquals(EMPTY_STRING_REVERSED, actual);
    }
    
    @Test
    public void toReverseStringConsistingOfLettersOnlyTest() {
        String actual = sm.reverseString(ONLY_LETTER);
        assertEquals(ONLY_LETTER_REVERSED, actual);
    }
    
    @Test
    public void toReverseStringConsistingOfDigitsOnlyTest() {
        String actual = sm.reverseString(ONLY_DIGITS);
        assertEquals(ONLY_DIGITS_REVERSED, actual);
    }
    
    @Test
    public void toReverseStringConsistingOfSpecSymbolsOnlyTest() {
        String actual = sm.reverseString(ONLY_SPEC_SYMBOLS);
        assertEquals(ONLY_SPEC_SYMBOLS_REVERSED, actual);
    }
    
    @Test
    public void toReverseStringConsistingOfLettersAndDigitsTest() {
        String actual = sm.reverseString(LETTERS_AND_DIGITS);
        assertEquals(LETTERS_AND_DIGITS_REVERSED, actual);
    }
    
    @Test
    public void toReverseStringConsistingOfLettersAndSpecSymbolsTest() {
        String actual = sm.reverseString(LETTERS_AND_SPEC_SYMBOLS);
        assertEquals(LETTERS_AND_SPEC_SYMBOLS_REVERSED, actual);
    }
    
    @Test
    public void toReverseStringConsistingOfDigitsAndSpecSymbolsTest() {
        String actual = sm.reverseString(DIGITS_AND_SPEC_SYMBOLS);
        assertEquals(DIGITS_AND_SPEC_SYMBOLS_REVERSED, actual);
    }
    
    @Test
    public void toReverseStringConsistingLettersAndDigitsAndSpecSymbolsTest() {
        String actual = sm.reverseString(LETTERS_AND_DIGITS_AND_SPEC_SYMBOLS);
        assertEquals(LETTERS_AND_DIGITS_AND_SPEC_SYMBOLS_REVERSED, actual);
    }
}
