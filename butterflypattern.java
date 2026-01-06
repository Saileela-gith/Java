import java.util.Scanner;
public class butterflypattern {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=sc.nextInt();
        int i;
        int j;
        int k;
        int l;
        //this loop is for the half butterfly 
        for(i=1;i<=n;i++)//this loop is the for the rows
        {
           for(j=1;j<=i;j++)
           {
            //this loop is for printing stars
            System.out.print("*");
           }
           for(k=1;k<=2*(n-i);k++)
           {
            //this loop is for the printing spaces
            System.out.print(" ");
           }
           for(l=1;l<=i;l++)
           {
            //this loop is for the print stars
            System.out.print("*");
           }
           System.out.println();
        }
        //this loop is for the remaining half
        for(i=n;i>=1;i--)//this loop is the for the rows
        {
           for(j=1;j<=i;j++)
           {
            //this loop is for printing stars
            System.out.print("*");
           }
           for(k=1;k<=2*(n-i);k++)
           {
            //this loop is for the printing spaces
            System.out.print(" ");
           }
           for(l=1;l<=i;l++)
           {
            //this loop is for the print stars
            System.out.print("*");
           }
           System.out.println();
        }
    }
}
