import java.util.Scanner;
public class elseif {
    public static void main(String args[])
    {
        //This code is regarding the else if conditions
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the age:");
        int age=sc.nextInt();
        if(age>=18)
        {
            System.out.println("adult");
        }
        else if(age>=18 && age<18)
        {
            System.out.println("Teenage");
        }
        else if(age<18 && age<10)
        {
            System.out.println("Child");
        }
        else
        {
            System.out.println("Baby");
        }
    }
}
