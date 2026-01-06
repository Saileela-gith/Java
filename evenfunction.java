import java.util.Scanner;
public class evenfunction {
    //this code is regarding to print the number true when it is even else false
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
        if(even(n))
        {
          System.out.print("Number is Even");
        }
        else{
            System.out.print("Number is Odd");
        }
    }
}
