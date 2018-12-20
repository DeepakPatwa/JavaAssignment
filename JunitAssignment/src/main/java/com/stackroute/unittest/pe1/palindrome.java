package com.stackroute.unittest.pe1;

import java.util.Scanner;

public class palindrome {
    public static int CheckPalindrome(int input)
    {
        int temp=input;
        int rev=0;
        int reminder;
        int length=0;
        while(input!=0) {
            reminder = input % 10;
            rev = (rev * 10) + reminder;
            input=input/10;
        }

        int sum=-1;
        if(temp==rev)
        {
            sum=0;
            while(rev>0)
            {
                if ((rev % 10) % 2 == 0) {
                    sum = sum + (rev % 10);
                }
                rev = rev / 10;
            }
        }
        return sum;
    }
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);

        int input=in.nextInt();
        int res=CheckPalindrome(input);
        if(res==-1)
            System.out.println("Not palindrome");
        else if(res>25)
            System.out.println(input + " is palindrome and the sum( " +res +") of even numbers is greater than 25");
        else
            System.out.println(input + " is palindrome and the sum( " +res +") of even numbers is less than 25");
    }
}
