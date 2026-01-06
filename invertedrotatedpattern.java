import java.util.Scanner;
public class invertedrotatedpattern {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=sc.nextInt();
        int i;
        int j;
        int k;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n-i;j++)//this loop is for printing spaces
            {
                System.out.print(" ");
            }
            for(k=1;k<=i;k++)//this loop is for printing stars
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
