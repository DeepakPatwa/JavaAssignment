package com.stackroute.unittest.pe1;

import java.util.Scanner;

public class CharType {

    public static String charDetail(char ch)
    {
        if(ch>='a' && ch<='z')
            return "Small letter";
        else if(ch>='A' && ch<='Z')
            return "Capital letter";
        else if(ch>='0' && ch<='9')
            return "Digit";
        else
            return "Special character";
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        char ch=in.next().charAt(0);
        String res=charDetail(ch);
        System.out.println(res);
    }
}
