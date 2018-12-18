import java.util.Scanner;

public class Ass1q10 {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        int n=in.nextInt();
        String strRe="";
        for(int i=str.length()-n;i<str.length();i++)
            strRe+=str.charAt(i);
        System.out.print(str);
        for(int i=0;i<n;i++)
            System.out.print(strRe);
    }
}
