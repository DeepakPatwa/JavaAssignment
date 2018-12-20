package com.stackroute.unittest.pe1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SortSumCheck {

    public static java.lang.Integer[] SortArr(String str)
    {
        Integer arr[] = new Integer[str.length()];
        for(int i=0;i<str.length();i++)
        {
            arr[i]=str.charAt(i)-'0';
        }
        Arrays.sort(arr, Collections.reverseOrder());
        return arr;
    }
    public static int sum(java.lang.Integer[] arr)
    {
        int sumres=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
            sumres+=arr[i];

        }
        return sumres;
    }
    public static boolean check(int sum)
    {
        if(sum> 15)
            return true;
        else
            return false;
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        java.lang.Integer[] arr=SortArr(str);
        System.out.println(Arrays.toString(arr));
        int sumres=sum(arr);
        System.out.println("Sum= " + sumres);
        boolean res=check(sumres);
        if(res==true)
            System.out.println("True");
        else
            System.out.println("False");
    }
}
