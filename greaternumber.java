import java.util.Scanner;
public class greaternumber {
    public static void main(String args[])
    {
        //this code is to find the greatest number
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of the a:");
        int a=sc.nextInt();
        System.out.print("Enter the value of the b:");
        int b=sc.nextInt();
        if(a>b)
        {
            System.out.println("The larger number is:"+a);
        }
        else{
            System.out.println("The larger number is:"+b);
        }
    }
}
