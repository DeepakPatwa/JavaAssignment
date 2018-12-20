package com.stackroute.unittest.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class GuessTheNumberTest {
    @Test
    public void CheckValue()
    {
        GuessTheNumber obj=new GuessTheNumber();
        int res1=obj.CheckVal(12);
        int res2=obj.CheckVal(55);
        int res3=obj.CheckVal(34);

        assertEquals("CheckVal is failing ",res1, 0);
        assertEquals("CheckVal is failing ",res2, 1);
        assertEquals("CheckVal is failing ",res3, -1);
    }

}