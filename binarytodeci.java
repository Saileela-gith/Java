import java.util.Scanner;
//binary to decimal conversion
public class binarytodeci {
    public static void deci(int n)
    {
        int ld;
        int pow=0;
        int decimal=0;
        while(n>0)
        {
            ld=n%10;
            decimal=decimal+(int)(ld*Math.pow(2,pow));
            pow++;
            n=n/10;
        }
        System.out.print("THe conversion of binary to decimal value is:"+decimal);
    }
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter the number:");
       int n=sc.nextInt();
       deci(n);
    }
}
