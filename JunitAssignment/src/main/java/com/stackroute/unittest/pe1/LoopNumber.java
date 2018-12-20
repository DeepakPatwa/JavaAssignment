package com.stackroute.unittest.pe1;

import java.util.Scanner;

public class LoopNumber {
    public static String LoopString(int n)
    {
        String str="";
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
                str=str + i + " ";
        }
        return str;
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        String str=LoopString(n);
        System.out.println(str);
    }
}
