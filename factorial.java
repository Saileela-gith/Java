import java.util.Scanner;
public class factorial
{
    public static int factori(int num)//factorial function
    {
        int fact=1;//assining the factorial of a number as 1
        int i;
        for(i=1;i<=num;i++)
        {
            fact=fact*i;//calculating the factorial
        }
        return fact;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");//input statement
        int num=sc.nextInt();
        int answer=factori(num);//calling the return type function
        System.out.print("The factorial of the number is:"+answer);//printing output
    }
}