import java.util.Scanner;
public class leapyear {
  //this code is to find the year is leap year or not  using the if-else and else-if conditions.
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the year:");
        int year=sc.nextInt();
        if(year%4!=0)
        {
          System.out.print("Not a leap year");
        }
         else if(year%100 !=0)
        {
          System.out.print("Leap year");
        }
        else if(year%400==0)
        {
          System.out.print("Leapyear");
        }
        else 
        {
          System.out.print("Not a valid year");
        }
    }
}
