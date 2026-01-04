import java.util.Scanner;
public class ternary {
    //this code is regarding the ternary operator
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        // using terynary operator
        int result= (a>=b)?a:b;
        System.out.println("The answer is:"+result);
    }
}
