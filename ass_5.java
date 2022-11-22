import java.util.*;

public class ass_5
{
    public static boolean isPrime(int x)
    {
        
        if (x<=1)
        return false;
        if (x == 2)
        return true;
        if(x%2 == 0)
        return false;
        else
        return true;
        
    }
    public static void main()
    {
        Scanner sc = new Scanner (System.in);
        System.out .println("Enter a prime number");
        int s=sc.nextInt();
        //check
        boolean p=isPrime(s);
        if (p)
        {
            System.out.println("It is a Prime number");
            
            
        }
        else
        {
            for (int i=0;i<=10;i++)
            {
                s=s+i;
                boolean z=isPrime(s);
                if(z)
                {
                    System.out.println("Next prime:"+s);
                    break;
                }
               
                
                
            }
        }
        
    }
}