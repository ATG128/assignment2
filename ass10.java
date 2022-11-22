import java.util.*;
class ass10
{
    public static void main()
    {
        Scanner sc =new Scanner (System.in);
        int arr[]=new int [20];
        int eve[]=new int[20];
        int odd[]=new int [20];
        
        System.out.println("Enter 20 numbers to be segregated");
        for(int i=0;i<20;i++)
        arr[i]=sc.nextInt();
        
        //seg
        for(int i=0;i<20;i++)
        { 
            if(arr[i]%2 ==0)
            {
                eve[i]=arr[i];
            }
            else
            odd[i]=arr[i];
        }
        System.out.println("Even array:");
        for (int i=0;i<20;i++)
        System.out .println(eve[i]);
        System.out.println("Odd array");
        for (int i=0;i<20;i++)
        System.out .println(odd[i]);    }
}