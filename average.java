import java.util.Scanner;
public class average {
    //this code is regarding the average of three numbers
    public static void numbers(int a,int b,int c)
    {
        int total=a+b+c;
        int avg=(total)/3;
        System.out.print("The average of three numbers is:"+avg);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the a value:");
        int a=sc.nextInt();
        System.out.print("Enter the b value:");
        int b=sc.nextInt();
        System.out.print("Enter the c value:");
        int c=sc.nextInt();
        numbers(a,b,c);
    }
}
