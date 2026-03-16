import java.util.Scanner;
public class overloading {
    //functio overloading
    public static int add(int a,int b)
    {
        int add=a+b;
        return add;
    }
    public static int add(int a,int b,int c)
    {
        int add=a+b+c;
        return add;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int answ1=add(a,b);
        int answ2=add(a,b,c);
        System.out.println
        
        
        
        ("The sum of two numbers:"+answ1);
        System.out.print("The sum of three numbers:"+answ2);
    }
}
