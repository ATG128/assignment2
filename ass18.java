import java.util.*;
class ass18
{
    public static void main()
    {
        Scanner sc =new Scanner(System.in);
        double mark[]=new double[20];
        System.out.println("Enter Marks of 20 Students");
        for (int i=0;i<20;i++)
        mark[i]=sc.nextDouble();
        double sum=0;
       for (int i=0;i<20;i++)
       {
           sum=sum+mark[i];
       }
       double avg=sum/20;
       System.out.println("Average marks of 20 students: "+avg) ;   }
}