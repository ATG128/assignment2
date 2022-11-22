import java.util.*;
class ass6

{
    public static void main()
    {
        Scanner sc =new Scanner (System.in);
        System.out.println("Enter your to display");
        System.out.println("1.10 Fibonacci Numbers");
        System.out.println("2.Sum of the digits entered");
        int z =sc.nextInt();
        switch(z){
            case 1:
             int a=0,c=1,b,i;    
      System.out.print(a+" "+c);//printing 0 and 1    
    
      for(i=2;i<10;i++)   
     {    
       b=a+c;    
      System.out.print(" "+b);    
       a=c;    
       c=b;       
        }
       break;
       case 2:
       System.out.println("Enter a number ");
       int num =sc.nextInt();
       int sum =0 ,j;
       while (num>0){
           j=num%10;
           sum=sum+j;
           num=num/10;
           
           
       }
      
       System.out.print("Sum of digits:"+sum);
        break;
       default:
           System.out.println("wrong choice try again later");
           break;
    }
    
}
}