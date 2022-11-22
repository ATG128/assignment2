import java.util.*;
class ElectricityBill
{
    static String n;
    static int units;
    static double bill;
    static void accept()
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Customer Name");
        n=sc.next();
        System.out.println("Enter the Number of Units Consumed:");
        units=sc.nextInt();
    }
     static void calculate()
    {
        int temp;
        if(units>100&&units<=300)
        
    {
        temp=units-100;
        bill=(temp*3)+(100*2);
    }
    if(units<300)
    {
        temp=units-100;
        bill=(temp*5)+(100*2);
        bill=bill+bill*(2.5/100);
    }
    if(units<=100)
    bill=units*2;
   }
   static void print()
   {
       System.out.println("\fName Of Customer "+n);
       System.out.println("Units Consumed"+units);
       System.out.println("Total Bill Amout "+bill);
   }
   public static void main ()
   {
       accept();
       calculate();
       print();
   }

}