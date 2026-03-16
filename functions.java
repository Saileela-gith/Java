import java.util.Scanner;
public class functions {
    //calculating the functions
    public static void methods(int a,int b,int c,int d)
    {
        int result1=Math.min(a,b);
        int result2=Math.max(a,b);
        double result3=Math.pow(b,a);
        double result4=Math.sqrt(a);
        int result5=Math.abs(d);
        System.out.println("The maximum number is:"+result1);
        System.out.println("The minimum number is:"+result2);
        System.out.println("The power of number is:"+result3);
        System.out.println("The square root of a number is:"+result4);
        System.out.println("The absolute value is:"+result5);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the a value:");
        int a=sc.nextInt();
        System.out.print("Enter the value of b:");
        int b=sc.nextInt();
        System.out.print("Enter the value of c:");
        int c=sc.nextInt();
        System.out.print("Enter the value of d:");
        int d=sc.nextInt();
        methods(a,b,c,d);
    }
    
}
