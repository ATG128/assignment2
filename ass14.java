import java.util.*;
class ass14
{
     static void SumSeries(int n,double x)
    {
        double sum=0.0;

        for (int i=1;i<=n;i++ )
        {
            if (i%2 ==0)
            {
                sum=sum-(double) x/i;
                                
            }
            else
            sum=sum+(double)x/i;
            
        }
        System.out.println("Sum:"+sum);
    }
     static void SumSeries()
    {
      int p=1,sum=0;
      for(int i=1;i<=20;i++)
      {
          p=p*i;
          sum=sum+p;
      }
      System.out.println("Sum of the series:"+sum);
      
      
    }
    public static void main()
    {
        Scanner sc =new Scanner (System.in);
        int b;
        double x;
        System.out.println("EnterLimit of the series:");
        b=sc.nextInt();
        System.out.println("Enter the value");
        x=sc.nextDouble();
        SumSeries(b,x);
        SumSeries();
        
    }
}