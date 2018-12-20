package com.stackroute.unittest.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class AddStringTest {
    @Test
    public void NumAddTest() throws Exception{
        AddString as=new AddString();
        String input="12 24 12";
        int expected=48;
        int res=as.AddNum(input);

        assertEquals("NumAdd is failing ",expected,res);
    }
}