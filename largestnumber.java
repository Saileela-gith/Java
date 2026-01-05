import java.util.Scanner;
public class largestnumber {
    //this code is to find the largest of three numbers
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the 1st number:");
        int a=sc.nextInt();
        System.out.print("Enter the 2nd number");
        int b=sc.nextInt();
        System.out.print("Enter the 3rd number:");
        int c=sc.nextInt();
        if(a>b && a>c)
        {
            System.out.print(a);

        }
        else if(b>a && b>c)
        {
          System.out.print(b);
        }
        else 
        {
            System.out.print(c);
        }
    }
}
