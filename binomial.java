import java.util.Scanner;
public class binomial {
    public static int printfact(int n)
    {
        //this code is regarding calculating binomial coefficient expression
        int fact=1;
        int i;
        for(i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        return fact;
    }
    public static int bincoeff(int n,int r)
    {
        int fact_n=printfact(n);
        int fact_r=printfact(r);
        int fact_nmr=printfact(n-r);
        int coeff=(fact_n)/(fact_r)*(fact_nmr);
        return coeff;
    }
    public static void main(String args[])
    {
          int result=bincoeff(5,4);
          System.out.print("The binomial coefficient is:"+result);
    }
}
