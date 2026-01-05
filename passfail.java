import java.util.Scanner;
public class passfail {
    // this code is to find the student is pass or fail 
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the marks:");
        int marks=sc.nextInt();
        if(marks>=33)
        {
            System.out.print("PASS");
        }
        else{
            System.out.print("FAIL");
        }
    }
}
