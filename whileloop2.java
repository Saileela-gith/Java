import java.util.Scanner;
public class whileloop2 {
    public static void main(String args[])
    {
        //this code is to print the n numbers
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int num=sc.nextInt();
        int n=1;
        while(n<=num)
        {
            System.out.println(n);
            n++;
        }
    }
}
