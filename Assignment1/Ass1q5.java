import java.util.Scanner;

public class Ass1q5 {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
            int len=str.length();
            int sum=0;
            int i;
           // System.out.println(str + " " + len);
            for(i=0;i<len;i++)
            {
                int num=0;
                while(i<len && str.charAt(i)!=' ')
                {
                    num=num*10+(str.charAt(i)-'0');
                    //System.out.println(" char ="+ str.charAt(i) + " num= " + num + "i= " + i);
                    i++;

                }
                sum+=num;
                //System.out.println(" suml= " + sum + " ");
//                if(i>=len)
//                    break;
//                if(str.charAt(i)==' ')
//                    continue;

            }
            System.out.println("Sum= " + sum + " ");
        }
}
