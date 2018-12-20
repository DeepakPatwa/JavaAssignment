package com.stackroute.unittest.pe1;

import java.util.Scanner;

public class GuessTheNumber {

    public static int CheckVal(int input)
    {
        int num=34;
        if(input>num) {
            return 1;
        }
        else if(input<num){
            return 0;
        }
        else {
            return -1;

        }
    }
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int num=34;
        int input=in.nextInt();
        while(true)
        {
            int res=CheckVal(input);
            if(res==1) {
                System.out.println("Number guessed is more than original number");
                input=in.nextInt();
            }
            else if(res==0){
                System.out.println("Number guessed is less than original number");
                input=in.nextInt();
            }
            else {
                System.out.println("Number guessed matches the original number");
                break;
            }
        }
    }
}
