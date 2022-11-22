import java.util.*;

class ass8
{
    
    public static void main()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("How many lines of pattern do you want?");
        int x=sc.nextInt();
       
        for (int i=1;i<=x;i++)
        {
            System.out.println();
           for(int j=1;j<=i;j++)
           {
               if(j%2 ==0&&j>=2)
               System.out .print(" #");
               else {
                   System.out.print(" *");
               }
           }
        }
        
    }
}