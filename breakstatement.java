import java.util.Scanner;
public class breakstatement {
    //this code is regarding breakstatement
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter the number:");
      int num=sc.nextInt();
      int i;
      for(i=0;i<num;i++)
      {
        System.out.println(i);
        if(i==3)
        {
            
            break;
        }
      }
    }
}
