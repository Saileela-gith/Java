import java.util.Scanner;
public class incometax {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the ammount:");
        int amt=sc.nextInt();
        int tax;
        if(amt<500000)
        {
            tax = 0;
            System.out.print("Tax:"+tax);

        }
        else if(amt>500000 && amt<100000)
        {
            tax=(int)(amt*0.2);
            System.out.print("Tax is:"+tax);
        }
        else if(amt>100000)
        {
            tax=(int)(amt*0.3);
            System.out.print("Tax is:"+tax);
        }
    }
}
