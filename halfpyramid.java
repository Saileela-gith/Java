import java.util.Scanner;
public class halfpyramid {
    //this code is regarding half pyramid
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int num=sc.nextInt();
        int i;
        int j;
        for(i=1;i<=num;i++)//rows
        {
            for(j=1;j<=i;j++)//what to print 
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
