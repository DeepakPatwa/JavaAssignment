package com.stackroute.unittest.pe1;

import java.util.Scanner;

public class TomAndJerry {
    public static boolean isEven(int num)
    {
        if(num%2==0)
            return true;
        else
            return false;
    }

    public static boolean IsInInterval(int num)
    {
        if(num>=20 && num<=30)
            return true;
        else
            return false;
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        if(isEven(num)){
            if(IsInInterval(num))
                System.out.println("Jerry");}
        else{
            System.out.println(num);
            if(IsInInterval(num)){
                System.out.println("Tom");
            }
        }
    }
}
