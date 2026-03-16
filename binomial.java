import java.util.Scanner;
public class binomial {
    //calculating the binomial coefficient
    public static int factori(int n)//factorial function
    {
        int fact=1;//assining the factorial of a number as 1
        int i;
        for(i=1;i<=n;i++)
        {
            fact=fact*i;//calculating the factorial
        }
        return fact;

    }
    public static int factori(int n,int r)
    {
        int n_fact;
        int r_fact;
        int nmr;
        n_fact=factori(n);
        r_fact=factori(r);
        nmr=factori(n-r);
        int answ=((n_fact)/(r_fact*nmr));
        return answ;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n:");//input statement
        int n=sc.nextInt();
        System.out.print("Enter the value of r:");
        int r=sc.nextInt();
        int answer=factori(n,r);//calling the return type function
        System.out.print("The factorial of the number is:"+answer);//printing output
    }
}

