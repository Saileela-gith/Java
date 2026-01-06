import java.util.Scanner;
public class binary {
    //this code is to convert the number form binary to decimal
    public static void bindeci(int n)
    {
        int deci=0;
        int pow=0;
        while(n>0)
        {
            int ld=n%10;//this will give the lastdigit of the number
            deci=deci+(ld*(int)Math.pow(2,pow));// for converting teh decimal to binary
            pow++;
            n=n/10;//this line will remove one number
        }
        System.out.print("The answer is:"+deci);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=sc.nextInt();
        bindeci(n);
    }
}
