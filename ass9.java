import java.util.*;

public class ass9
{
    public static void main()
    {
        int x;
        int num,re=1,sum=0;
        Scanner sc =new Scanner (System.in);
        System.out.print("Enter a number you want to check: ");  
        x=sc.nextInt();
        num=x;
        while(num>9)
        {
            while(num>0)
            {
                re=num%10;
                sum = sum + re;  
                num=num/10;
                
            }
            num = sum; 
            sum=0;
            
        }
        if (num == 1)  
            {  
                     System.out.println(x+" given number is a magic number.");  
                  }  
                  else  
                    {   
                      System.out.println(x+" is not a magic number.");  
                }  
    }
}
