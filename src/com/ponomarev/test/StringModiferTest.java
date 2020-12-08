package com.ponomarev.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import com.ponomarev.main.*;

public class StringModiferTest {

    StringModifer sm;

    @Before
    public void initObject() {
        sm = new StringModifer();
    }
    
    @Test(expected = NullPointerException.class)
    public void toReverseStringConsistingOfNullTest() {
        String source = sm.reverseString(null);
    }
    
    @Test
    public void toReverseStringConsistingOfEmptyStringTest() {
        String source = "";
        String expected = "";
        
        String actual = sm.reverseString(source);
        assertEquals(expected, actual);
    }
    
    @Test
    public void toReverseStringConsistingOfLettersOnlyTest() {
        String source = "qwerty asdfgh zxcvbn";
        String expected = "ytrewq hgfdsa nbvcxz";
        
        String actual = sm.reverseString(source);
        assertEquals(expected, actual);
    }
    
    @Test
    public void toReverseStringConsistingOfDigitsOnlyTest() {
        String source = "1234 567 89 0";
        String expected = "1234 567 89 0";
        
        String actual = sm.reverseString(source);
        assertEquals(expected, actual);
    }
    
    @Test
    public void toReverseStringConsistingOfSpecSymbolsOnlyTest() {
        String source = "!@#$ %^& *( )";
        String expected = "!@#$ %^& *( )";
        
        String actual = sm.reverseString(source);
        assertEquals(expected, actual);
    }
    
    @Test
    public void toReverseStringConsistingOfLettersAndDigitsTest() {
        String source = "q1we2rt3y 4as5df6gh 7zxc8vb90n";
        String expected = "y1tr2ew3q 4hg5fd6sa 7nbv8cx90z";
        
        String actual = sm.reverseString(source);
        assertEquals(expected, actual);
    }
    
    @Test
    public void toReverseStringConsistingOfLettersAndSpecSymbolsTest() {
        String source = "q!w@er#ty$ %asd^fg&h z*(xcvb{n";
        String expected = "y!t@re#wq$ %hgf^ds&a n*(bvcx{z";
        
        String actual = sm.reverseString(source);
        assertEquals(expected, actual);
    }
    
    @Test
    public void toReverseStringConsistingOfDigitsAndSpecSymbolsTest() {
        String source = "12!@34# 56%^7 ^8&9 *0";
        String expected = "12!@34# 56%^7 ^8&9 *0";
        
        String actual = sm.reverseString(source);
        assertEquals(expected, actual);
    }
    
    @Test
    public void toReverseStringConsistingLettersAndDigitsAndSpecSymbolsTest() {
        String source = "#q1w@e2rt%^^&3y 4as5%*df6&*gh 7z*(xc8vb9**0n";
        String expected = "#y1t@r2ew%^^&3q 4hg5%*fd6&*sa 7n*(bv8cx9**0z";
        
        String actual = sm.reverseString(source);
        assertEquals(expected, actual);
    }
}
