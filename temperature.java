import java.util.Scanner;
public class temperature {
    //this code is the person is having the fever or not using the tempearture
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double temp=sc.nextDouble();
        if(temp>100)
        {
            System.out.print("You have a fever!");
        }
        else{
            System.out.print("You don't have a fever!");
        }
    }
}
