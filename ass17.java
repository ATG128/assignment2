import java.util.*;
class ass17
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int age[]=new int[20];
        System.out.println("Enter Age of 20 People");
        for (int i=0;i<20;i++)
        age[i]=sc.nextInt();
        for (int i=0;i<20;i++)
        {
            if(age[i]>1&&age[i]<=5)
            {
                System.out.println(age[i]+" Belongs to Infants");
            }
            if(age[i]>6&&age[i]<=15)
            {
                System.out.println(age[i]+" Belongs to Teenager");
            }
            if(age[i]>16&&age[i]<=30)
            {
                System.out.println(age[i]+" Belongs to Young");
            }
            if(age[i]>31&&age[i]<=55)
            {
                System.out.println(age[i]+" Belongs to Adult");
            }
            if(age[i]>56&&age[i]<=60)
            {
                System.out.println(age[i]+" Belongs to Senior Adult");
            }
            if(age[i]>61&&age[i]<=90)
            {
                System.out.println(age[i]+" Belongs to Senior Citizen");
            }
            
            if(age[i]>91&&age[i]<=100)
            {
                System.out.println(age[i]+" Belongs to Great Senior Adult");
            }
          
        }
    }
}