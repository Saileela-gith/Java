import java.util.Scanner;
public class factorial {
    public static int printfact(int n)
    {
        int fact=1;
        int i;
        for(i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        return fact;
    }
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter the number:");
       int n=sc.nextInt();
       int result=printfact(n);
       System.out.print("The factorial of the number is:"+result);
    }
}
