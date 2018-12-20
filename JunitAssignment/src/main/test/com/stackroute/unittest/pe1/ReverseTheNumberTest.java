package com.stackroute.unittest.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseTheNumberTest {
    @Test
    public void Reverse()
    {
        ReverseTheNumber obj=new ReverseTheNumber();
        String res=obj.Reverse("Hello");
        assertEquals("ReverseThe is failing ","olleH",res);
    }

}