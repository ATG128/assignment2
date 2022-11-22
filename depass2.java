import java.util.*;
class depass2
{
    public static void main()
    {
        Scanner sc =new Scanner (System.in);
        System.out.print("Enter the name of the car:");
        String name=sc.next();
        System.out.print("Enter the original price of the car:");
        int price=sc.nextInt();
        System.out.println("Enter the no. of years used");
        int age=sc.nextInt();
        int dep,amt;
       dep=0;
        
       
            if(age ==1)
            dep=price*10/100;
            if (age ==2)
        
            dep=price*20/100;
            if(age ==3) 
            dep=price*30/100;
            if(age ==4)
            dep=price*50/100;
            if(age>4)
            dep=price*60/100; 
            else 
            System.out.print("Wrongchoice");
            
        
        System.out.println("Original price:"+price);
        System.out.println("Deprecated Value:"+dep);
        amt=price-dep;
        System.out.println("Amount to be paid:"+amt);
        
        
        
        
    }
}