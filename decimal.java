import java.util.Scanner;
public class decimal {
    //this code is regarding converting decimal to binary 
    public static void decibinary(int n)
    {
        int bin=0;
        int pow=0;
        while(n>0)
        {
            int ld=n%2;//this will give the lastdigit of the number
            bin=bin+(ld*(int)Math.pow(10,pow));// for converting decimal to binary
            pow++;
            n=n/2;//this line will remove one number
        }
        System.out.print("The answer is:"+bin);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=sc.nextInt();
        decibinary(n);
    }
}
