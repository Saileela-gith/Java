import java.util.Scanner;
public class product {
    public static int multiplication(int a,int b)//function defination with parameters
    {
        int mult=a*b;
        return mult; //return statement
    }
    public static void main(String args[])
    {
        int result=multiplication(5,5);//function call with arguments
        System.out.print("The annswer is:"+result);
    }
}
