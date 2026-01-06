public class hallowrectangle {
    //this code is regarding the hallow recatangle pattern
    public static void main(String args[])
    {
        int rows=4;
        int cols=5;
        int i;
        int j;
        for(i=1;i<=rows;i++)//for rows
        {
            for(j=1;j<=cols;j++)//for columns
            {
                if(i==1||i==rows||j==1||j==cols)//boundary line 
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
