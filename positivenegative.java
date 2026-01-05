import java.util.Scanner;
public class positivenegative {
   public static void main(String args[])
   {
    Scanner sc=new Scanner(System.in);

    System.out.print("Enter the number:");
    int num=sc.nextInt();
    if(num>=0)
    {
        System.out.print("positive");
    }
    else{
        System.out.print("Negative");
    }
   } 
}
