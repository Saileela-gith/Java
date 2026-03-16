import java.util.Scanner;
public class evenodd {
    public static boolean even(int n)
    {
        if(n%2==0)
        {
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=sc.nextInt();
        if (even(n))
        {
            System.out.print("The number is even");
        }
        else{
            System.out.print("The number is odd");
        }
    }
}
