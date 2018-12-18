import java.util.Scanner;

public class Ass1q6 {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        char ch=in.next().charAt(0);
        if(ch>='a' && ch<='z')
            System.out.println("Small letter");
        else if(ch>='A' && ch<='Z')
            System.out.println("Capital letter");
        else if(ch>='0' && ch<='9')
            System.out.println("Digit");
        else
            System.out.println("Special character");
    }
}
