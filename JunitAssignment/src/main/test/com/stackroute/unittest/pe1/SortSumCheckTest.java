package com.stackroute.unittest.pe1;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class SortSumCheckTest {

    @Test
    public void sortArr() {
        SortSumCheck obj=new SortSumCheck();
        String str="123456";
        java.lang.Integer[] arr=obj.SortArr(str);
        String resString= Arrays.toString(arr);

        assertEquals("sortArr failed",resString,"[6, 5, 4, 3, 2, 1]");
    }

    @Test
    public void sum() {
        SortSumCheck obj=new SortSumCheck();
        String str="123456";
        java.lang.Integer[] arr={6, 5, 4, 3, 2, 1};
        int res=obj.sum(arr);
        assertEquals("sum failed",res,12);
    }

    @Test
    public void check() {
        SortSumCheck obj=new SortSumCheck();
        boolean res=obj.check(16);
        assertEquals("check failed",true,res);
    }
}