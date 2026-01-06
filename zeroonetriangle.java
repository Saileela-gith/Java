import java.util.Scanner;
public class zeroonetriangle {
    //this code is regarding to print the zero to one traingle
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=sc.nextInt();
        int i;
        int j;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                if((i+j)%2==0)
                {
                    System.out.print("1"+" ");//to print 1 
                }
                else
                {
                    System.out.print("0"+" ");//to print 0
                }
            }
            System.out.println();
        }
    }
}
