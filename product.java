import java.util.*;
public class product {
    public static int printadd(int num1,int num2)
    {
        int sum=num1+num2;
        return sum;
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int answ=printadd(a,b);
        System.out.print("The answer is:"+answ);
    }
}
