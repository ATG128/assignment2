import java.util.*;
class ass13
{
    public static void main()
    {
        Scanner sc= new Scanner(System.in);
        String g[]=new String[10];
        boolean b;
        System.out.println("Enter 10 Words to check pallindrome");
        for(int i=0;i<10;i++)
         g[i]=sc.next();
         System.out.print("Pallindrom words:");
        for (int i=0;i<10;i++)
        {
            b=isPalindro(g[i]);
            if(b)
            {
                System.out.print("  "+g[i]);
            }
            
        }
    
        
        
        
        
    }
    public static boolean isPalindro(String str)
    {
        
        String re = "";
        boolean x = false;
 
        for (int i = str.length() - 1; i >= 0; i--) {
            re = re + str.charAt(i);
        }
 
       
        if (str.equals(re)) {
            x = true;
        }
        return x;
}
}