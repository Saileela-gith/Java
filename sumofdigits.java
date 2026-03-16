import java.util.Scanner;
public class sumofdigits {
    //sum of the digit
    public static void sumdigits(int n)
    {
        int ld;
        int sum=0;
        while(n>0)
        {
            ld=n%10;
            sum=sum+ld;
            n=n/10;
        }
        System.out.print("The sum of the number is:"+sum);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=sc.nextInt();
        sumdigits(n);
        }
}
