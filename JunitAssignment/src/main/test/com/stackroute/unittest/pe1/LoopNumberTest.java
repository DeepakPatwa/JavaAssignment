package com.stackroute.unittest.pe1;

import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.*;

public class LoopNumberTest {
    @Test
    public void TestLoopString()
    {
        LoopNumber ln = new LoopNumber();
        String str1=ln.LoopString(5);
        String Expected="1 2 2 3 3 3 4 4 4 4 5 5 5 5 5 ";

        assertEquals("testLoopString is failing ",Expected,str1);
    }
}