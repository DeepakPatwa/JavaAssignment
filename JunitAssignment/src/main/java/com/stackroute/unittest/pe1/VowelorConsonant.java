package com.stackroute.unittest.pe1;

import java.util.Scanner;

public class VowelorConsonant {
    public static boolean isAlphabet(char input)
    {
        if((input>='a' && input<='z') || (input>='A' && input<='Z'))
            return true;
        else
            return false;
    }

    public static boolean isVowel(char input)
    {
        if(input=='a' || input=='e' || input=='i' || input=='o' || input=='u' || input=='A' || input=='E'|| input=='I' || input=='O' || input=='U')
        {
            return true;
        }
        else
            return false;
    }

    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        int len=str.length();
        for(int i=0;i<len;i++)
        {
            char input=str.charAt(i);
            if(isAlphabet(input))
            {
                if(isVowel(input))
                {
                    System.out.println("Vowel");
                }
                else
                    System.out.println("Consonant");
            }
        }
    }
}
