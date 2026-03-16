public class Test
{
    public static void printhello()//creating the function withno return type
    {
        System.out.print("Hello World");
    }
    public static int printsum()//creating the function with the return type
    {
        int a=5;
        int b=10;
        int sum=a+b;
        return sum;//return the value
    }
    public static void main(String args[])
    {
        printhello();//function call
        printhello();
        int answ=printsum();
        System.out.print("The answer is:"+answ);
    }
}