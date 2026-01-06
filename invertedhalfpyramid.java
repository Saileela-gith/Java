import java.util.Scanner;
public class invertedhalfpyramid {
    //this code is regarding the inverted half pyramid
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=sc.nextInt();
        int i;
        int j;
        for(i=1;i<=n;i++)//rows
        {
            for(j=1;j<n-i+1;j++)//to print numbers in the rows
            {
                System.out.print(j);
            }
            System.out.println();
        }

    }
}
