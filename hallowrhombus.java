import java.util.Scanner;
public class hallowrhombus {
    //this code is regarding the hallow rhombus pattern
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
            for(k=1;k<=n-i;k++)
            {
                System.out.print(" ");
            }
            for(j=1;j<=n;j++)//printing stars and spaces 
            {
               if(i==1||j==1||i==n||j==n)//boundary condition
               {
                 System.out.print("*");
               }
               else
               {
                System.out.print(" ");
               }
            }
            System.out.println();
        }
    }
}
