import java.util.Scanner;
public class palindrome {
    //this code is to check the given number is palindrome or not
    public static void number(int n)
    {
        int original=n;
        int rev=0;
        while(n>0)
        {
            int ld=n%10;
            rev=(rev*10)+ld;
            n=n/10;
        }
        if(rev==original)//condition to check the number is palindrome 
        {
            System.out.print("The given number is palindrome");
        }
        else{
            System.out.print("The given number is not a plaindrome");
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=sc.nextInt();
        number(n);
    }
}
