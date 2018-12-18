import java.util.Scanner;

public class a {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        //long input=scr.nextLong();
//        String s1= in.next();
//        StringBuilder s = new StringBuilder(s1);
//        System.out.println(s.toString());
//        StringBuilder sr = s.reverse();
//        System.out.println(sr.toString());
//        int sum=0;
//        if(sr.compareTo(s)==0)
//        {
//            for(int i=1;i<s.length();i=i+2) {
//                //char temp =String.valueOf(s.charAt(i));
//                char ch =  s.charAt(i);
//                sum+=Character.getNumericValue(ch);
//            }
//            System.out.println(sum);
//        }
//        else
//            System.out.println("go");

        long input=in.nextLong();
        long temp=input;
        long rev=0;
        long reminder;
        int length=0;
        while(input!=0) {
            reminder = input % 10;
            rev = (rev * 10) + reminder;
            input=input/10;
            length++;
        }
        long sum=0;
        if(temp==rev)
        {
            while(rev!=0)
            {
                reminder=rev%10;
                if(reminder%2==0)
                    sum+=reminder;
                rev/=10;
            }
            System.out.println(sum);
        }
        else
            System.out.println("No");
    }

}


