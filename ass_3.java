import java.util.*;
public class ass_3
{
    public static void main ()
    {
        Scanner sc= new Scanner(System.in);
        System.out .println("Enter value of a");
        int a =sc.nextInt();
        System.out.println("Enter the value of n");
        int n =sc.nextInt();
        int x=1;
        double s;
        s=0;
        for(int i=1;i<=n;i++)
        {
    
            
            if(i%2 == 0)
            s =s+Math.pow(a,x);
            else
             s =s-Math.pow(a,x);
            x=x+2;
        }
        int j=(int)s;
        System.out.println("Sum="+j);
    }
    
}
