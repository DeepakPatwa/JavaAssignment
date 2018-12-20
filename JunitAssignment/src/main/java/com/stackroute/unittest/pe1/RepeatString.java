package com.stackroute.unittest.pe1;

import java.util.Scanner;

public class RepeatString {
    public static String RepeatLastNChar(String str, int n)
    {
        String str1="";
        String strRe="";
        for(int i=str.length()-n;i<str.length();i++)
            str1+=str.charAt(i);
        strRe+=str;
        for(int i=0;i<n;i++)
            strRe+=str1;
        return strRe;
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        int n=in.nextInt();
        String strRe="";
        strRe=RepeatLastNChar(str,n);
        System.out.println(strRe);
    }
}
