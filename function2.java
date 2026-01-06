public class function2 {

    public static int sum(int a,int b)
    {
        // this code is regarding the function overloading with same function with different parameters
        int add=a+b;
        return add;
    }
    public static int sum(int c,int d,int a)
    {
        int add=a+c+d;
        return add;
    }
    public static void main(String args[])
    {
        int result1=sum(5,15);
        System.out.println("The sum is:"+result1);
        int result2=sum(4,8);
        System.out.println("The sum :"+result2);
    }
}


