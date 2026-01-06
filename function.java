import java.util.Scanner;
public class function {
    public static int sum(int a,int b)
    {
        // this code is regarding the function overloading with the different datatype
        int add=a+b;
        return add;
    }
    public static float sum(float a,float b)
    {
        float add=a+b;
        return add;
    }
    public static void main(String args[])
    {
        int result1=sum(5,15);
        System.out.println("The sum is:"+result1);
        float result2=sum(4.0f,8.2f);
        System.out.println("The sum :"+result2);
    }
}
