import java.util.*;
public class parameters {
    public static void printsum(int num1,int num2)
    {
        int sum=num1+num2;
        System.out.print("The sum is:"+sum);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of a:");
        int a=sc.nextInt();
        System.out.print("Enter the value of b:");
        int b=sc.nextInt();
        printsum(a,b);
    }
}
