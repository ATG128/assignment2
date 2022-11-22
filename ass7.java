import java.util.*;
public class ass7
{
    public static void main()
    {
        Scanner sc = new Scanner (System.in);
         double totalfare=0;int a=0;
        while(true)
        {
            System.out.println("Enter Name of The Passenger");
            String pas=sc.next();
            System.out.println("Enter The Age");
            int age=sc.nextInt();
            System.out.println("Enter the Distance Travelled");
            double d=sc.nextDouble();
            double fare=0;
            a++;
            double x=(double) d-5.0;
            if(d<0)
            {
                System.out.println("Wrong input please try again later");
                break;
                
            }
            if (d<=5)
            {
                fare=80;
            }
            if (d>5&&d<=15)
           
            {
                
                fare=80+(x*10);
            }
            if(d>15)
            {
                fare=80+(x*8);
                
            }
            totalfare=totalfare+fare;
            System.out.println("\fName:"+pas);
            System.out.println("Age:"+age);
            System.out.println("Total Distance Travelled:"+d);
            System.out.println("Total fare:"+fare);
            System.out.println("Do you want to add more passengers??");
            System.out.println("1.Yes");
            System.out.println("2.No");
            int z=sc.nextInt();
            switch(z)
            {
                case 1:
                continue;
                case 2:
                     System.out.println("Number of passengers travelled:"+a);
               System.out.println("Total fare received:"+totalfare);
               System.exit(1);
                    break;
            }
           
        }
    }
}