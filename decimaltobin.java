import java.util.Scanner;
public class decimaltobin {
    //Decimal to binary Conversion
    public static void decitobin(int n)
    {
        int deci=0;
        int pow=0;
        int ld;
        while(n>0)
        {
            ld=n%2;
            deci=deci+(int)(ld*Math.pow(10,pow));
            pow++;
            n=n/2;
        }
        System.out.print("The decimal to binary conversion is:"+deci);

    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");   
        int n=sc.nextInt(); 
        decitobin(n);
    }
}
