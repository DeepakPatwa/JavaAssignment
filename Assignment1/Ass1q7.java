import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ass1q7 {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        Integer arr[] = new Integer[str.length()];
        for(int i=0;i<str.length();i++)
        {
            arr[i]=str.charAt(i)-'0';
        }
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));
        int sum=0;
        for(int i=1;i<arr.length;i=i+2)
        {
            sum+=arr[i];
        }
        System.out.println("Sum= " + sum);
        if(sum> 15)
            System.out.println("True");
        else
            System.out.println("False");
    }
}
