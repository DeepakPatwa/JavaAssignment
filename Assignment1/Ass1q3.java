import java.util.Scanner;

public class Ass1q3 {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        int len=str.length();
        for(int i=0;i<len;i++)
        {
            char input=str.charAt(i);
            if((input>='a' && input<='z') || input>='A' && input<='Z')
            {
                if(input=='a' || input=='e' || input=='i' || input=='o' || input=='u' || input=='A' || input=='E'|| input=='I' || input=='O' || input=='U')
                {
                    System.out.println("Vowel");
                }
                else
                    System.out.println("Consonant");
            }
        }
    }
}
