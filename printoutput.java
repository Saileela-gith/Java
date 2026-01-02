import java.util.Scanner;
public class printoutput {
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        float pencil=sc.nextFloat();
        float pen=sc.nextFloat();
        float eraser=sc.nextFloat();
        float total=(pencil+pen+eraser);
        System.out.print("The total cost of the items are:"+total);
    }
}
