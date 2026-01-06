import java.util.Scanner;
public class floydstriangle {
    //this code is regarding the floyds triangle
    public static void main(String args[])
    {
        int num=1;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=sc.nextInt();
        int i;
        int j;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
              System.out.print(num+" ");
              num++;
            }
            System.out.println();
        }
    }
}
