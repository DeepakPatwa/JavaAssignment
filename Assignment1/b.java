import java.util.Scanner;

public class b {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        if(num%2==0){
            if(num>=20 && num<=30)
            System.out.println("Jerry");}
        else{
            System.out.println(num);
            if(num>=20 && num<=30) {
                System.out.println("Tom");
            }
        }
    }
}
