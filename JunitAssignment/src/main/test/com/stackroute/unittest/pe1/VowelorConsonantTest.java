package com.stackroute.unittest.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class VowelorConsonantTest {

    @Test
    public void isAlphabetTrue() {
        VowelorConsonant vc = new VowelorConsonant();
        boolean result=vc.isAlphabet('a');
        boolean result2=vc.isAlphabet('A');
        assertTrue("isAlphabateTrue is failing", result);
        assertTrue("isAlphabateTrue is failing:", result2);
    }

    @Test
    public void isAlphabetFalse() {
        VowelorConsonant vc = new VowelorConsonant();
        boolean result=vc.isAlphabet('1');
        assertFalse("isAlphabateFalse is failing", result);
    }

    @Test
    public void isVowelTrue() {
        VowelorConsonant vc = new VowelorConsonant();
        boolean result=vc.isVowel('i');
        boolean result2=vc.isVowel('I');
        assertTrue("isVowel is failing", result);
        assertTrue("isVowel is failing:", result2);
    }

    @Test
    public void isVowelFalse() {
        VowelorConsonant vc = new VowelorConsonant();
        boolean result=vc.isVowel('r');
        boolean result2=vc.isVowel('R');
        assertFalse("isVowelFalse is failing", result);
        assertFalse("isVowelFalse is failing:", result2);
    }
}