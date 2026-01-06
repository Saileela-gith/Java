import java.util.Scanner;
public class numbersum {
    public static void sumnum(int n)
    {
        //this code is regarding the sum of numbers
        int sum=0;
        int ld;
        while(n>0)
        {
            ld=n%10;
            sum=sum+ld;
            n=n/10;

        }
         System.out.print("The sum of number is:"+sum);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=sc.nextInt();
        sumnum(n);
    }
}
