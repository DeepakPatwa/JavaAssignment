import java.util.Scanner;

public class Ass1q8 {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int num=34;
        int input=in.nextInt();
        while(true)
        {
            if(input>num) {
                System.out.println("Number guessed is more than original number");
                input=in.nextInt();
            }
            else if(input<num){
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
