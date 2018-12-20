package com.stackroute.unittest.pe1;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class palindromeTest {
    @Test
    public void testPalindromeEvenSumGrater()
    {
        palindrome pe=new palindrome();
        //Act
        long actualValue=pe.CheckPalindrome(888888888);
        assertEquals("testPalindromeEvenSumGrater is failing ",72,actualValue);
    }

    @Test
    public void testPalindromeEvenSumlesser()
    {
        palindrome pe=new palindrome();

        long actualValue=pe.CheckPalindrome(111);
        assertEquals("testPalindromeEvenSumlesser is failing ",0,actualValue);
    }

    @Test
    public void testIsPalindrome()
    {
        palindrome pe=new palindrome();
        long actualValue=pe.CheckPalindrome(114);
        assertEquals("testPalindromeEvenSumlesser is failing ",-1,actualValue);
    }
}