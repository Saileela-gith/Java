import java.util.Scanner;
public class sum {
    //this code is regarding the adding the n of numbers
   public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number to add sum:");
        int num=sc.nextInt();
        int n=1;
        int sum=0;
        while(n<num)
            {
                System.out.println(n);
                sum=sum+n;
                n++;
            } 
            System.out.print("Sum is:"+sum);
    }
    
}
