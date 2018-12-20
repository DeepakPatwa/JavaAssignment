package com.stackroute.unittest.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class TomAndJerryTest {

    @Test
    public void testIsEvenTrue() throws Exception {
        TomAndJerry tj =new TomAndJerry();

        boolean result=tj.isEven(4);

        assertTrue("isEven Method failed ", result );
    }

    @Test
    public void testIsEvenFalse() throws Exception {
        TomAndJerry tj =new TomAndJerry();

        boolean result=tj.isEven(3);

        assertFalse("isEven Method failed ", result );
    }

    @Test
    public void IsInIntervalTrue() throws Exception {
        TomAndJerry tj =new TomAndJerry();

        boolean result=tj.isEven(22);

        assertTrue("isEven Method failed ", result );
    }

    @Test
    public void IsInIntervalFalse() throws Exception {
        TomAndJerry tj =new TomAndJerry();

        boolean result=tj.isEven(33);

        assertFalse("isEven Method failed ", result );
    }

}