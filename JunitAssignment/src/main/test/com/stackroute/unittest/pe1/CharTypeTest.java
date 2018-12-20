package com.stackroute.unittest.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class CharTypeTest {
    @Test
    public void testcharDetail() throws Exception{
        CharType ct=new CharType();

        assertEquals("CharType is failing ","Small letter", ct.charDetail('a'));
        assertEquals("CharType is failing ","Capital letter", ct.charDetail('A'));
        assertEquals("CharType is failing ","Digit", ct.charDetail('1'));
        assertEquals("CharType is failing ","Special character", ct.charDetail('@'));
    }

}