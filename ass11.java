import java.util.*;
public class ass11
{
    public static void main()
    {
        Scanner sc=new Scanner (System.in);
        int arr[]=new int[20];
        System.out.println("Enter 20 number to check");
        for (int i=0;i<20;i++)
        arr[i]=sc.nextInt();
        System.out.print("Perfect Squares are:");
        for (int i=0;i<20;i++)
        {
            
                int sr =(int)Math.sqrt(arr[i]);
                if(sr*sr == arr[i])
                System.out.print("\t"+arr[i]);
                  
        }
    }
}