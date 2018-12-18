import java.util.Scanner;

public class Ass1q9 {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        int len=str.length()-1;
        String strResult="";
        for(int i=len;i>=0;i--)
            strResult=strResult + str.charAt(i);
        System.out.print(strResult);
    }
}
