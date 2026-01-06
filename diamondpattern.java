import java.util.Scanner;
public class diamondpattern
{
    //this code is regarding the diamond pattern
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the number:");
    int n=sc.nextInt();
    int i;
    int j;
    int k;
    for(i=1;i<=n;i++)//rows
    {
        for(j=1;j<=n-i;j++)//spaces
        {
            System.out.print(" ");
        }
        for(k=1;k<=(2*i)-1;k++)//stars
        {
            System.out.print("*");
        }
        System.out.println();
    }
     for(i=n;i>=1;i--)//rows
    {
        for(j=1;j<=n-i;j++)//spaces
        {
            System.out.print(" ");
        }
        for(k=1;k<=(2*i)-1;k++)//stars
        {
            System.out.print("*");
        }
        System.out.println();
    }
  }
}