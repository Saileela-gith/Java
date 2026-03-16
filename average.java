import java.util.Scanner;
public class average {
    //this code is regarding the average of three numbers 
    public static void aver(int a,int b,int c)
    {
        int total;
        int avg;
        total=(a+b+c);
        avg=(total)/3;
        System.out.print("The average of the three numbers is:"+avg);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of the a:");
        int a=sc.nextInt();
        System.out.print("Enter the value of the b:");
        int b=sc.nextInt();
        System.out.print("Enter the value of the c:");
        int c=sc.nextInt();
        aver(a,b,c);
    }
}
