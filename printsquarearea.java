import java.util.Scanner;
public class printsquarearea {
  
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        //this code is regrading to find the area of the square
        System.out.print("Enter the side of the square:");
        int side=sc.nextInt();
        System.out.print("The are of the Square:"+side*side);

    }
}
