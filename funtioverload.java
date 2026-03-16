import java.util.Scanner;
public class funtioverload {
    //function overloading with different datatypes
    public static int mult(int a,int b)
    {

        int multi=a*b;
        return multi;
    }
    public static float mult(float a,float b)
    {
        float multi=a*b;
        return multi;
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int b=sc.nextInt();
      int answ1=mult(a,b);
       float  answ2=mult((float)a,(float)b);
       System.out.println("The multiplication of integer values:"+answ1);
       System.out.print("The multiplication of float values:"+answ2);

    }
}
