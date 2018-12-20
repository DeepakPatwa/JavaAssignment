package com.stackroute.unittest.pe1;

import java.util.Scanner;

public class ReverseTheNumber {

    public static String Reverse(String str)
    {
        int len=str.length()-1;
        String strResult="";
        for(int i=len;i>=0;i--)
            strResult=strResult + str.charAt(i);
        return strResult;
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        String strResult=Reverse(str);
        System.out.print(strResult);
    }
}
