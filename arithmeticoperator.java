import java.util.Scanner;
public class arithmeticoperator {
   public static void main(String args[])
   {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    //This code is regarding the arithmetic operators 
    System.out.println("The addition of a and b is:"+(a+b));
    System.out.println("The subtraction of a and b is:"+(a-b));
    System.out.println("The multiplication of a and b is:"+(a*b));
    System.out.println("The division of a and b is:"+(a/b));
    System.out.println("The modulus of a and b is:"+(a%b));//remainder
   } 
}
