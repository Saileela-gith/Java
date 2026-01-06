import java.util.Scanner;
public class swap {
    public static void numberswap(int a,int b)
    {
        int temp=a;//swapping of two values
         a=b;
         b=temp;
         System.out.println("The a value is:"+a);
         System.out.println("The b value is:"+b);
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter a value:");
      int a=sc.nextInt();
      System.out.print("Enter b value:");
      int b=sc.nextInt();
      numberswap(a,b);
      
    }
}
