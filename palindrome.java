import java.util.Scanner;
public class palindrome {
    //checking the number is palindrome or not 
    public static void reverse(int n)
    {
        int rev=0;
        int ld;
        int original=n;
        while(n>0)
        {
            ld=n%10;
            rev=(rev*10)+ld;//reversing a number using the formula
            n=n/10;
        }
        if(rev==original)//comparing a number
        {
            System.out.print("The number is palindrome");
        }
        else{
            System.out.print("The number is not a palindrome");
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=sc.nextInt();
        reverse(n);
    }
    
}
