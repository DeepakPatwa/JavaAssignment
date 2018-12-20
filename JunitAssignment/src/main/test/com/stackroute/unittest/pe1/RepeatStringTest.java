package com.stackroute.unittest.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class RepeatStringTest {
    @Test
    public void Repeat()
    {
        RepeatString obj=new RepeatString();
        String res=obj.RepeatLastNChar("Stackroute",5);
        assertEquals("RepeatString is failing ","Stackrouterouterouterouterouteroute",res);
    }
}