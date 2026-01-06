import java.util.Scanner;
public class starpattern
{
    //this code is regarding the star pattern
    public static void main(String args[])
    {
        //Inverted Star pattern
        int i;
        int j;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int num=sc.nextInt();
        for(i=1;i<=4;i++)//rows
        {
            for(j=1;j<=num-i+1;j++)//this loop defines what to print
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}