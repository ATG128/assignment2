import java.util.*;
class ass12
{
    public static void main()
    {
        Scanner  sc= new Scanner(System.in);
        System.out.println("Enter a String to be checked");
        String s=sc.next();
        boolean p=true;
        for (int i=0;i<s.length();i++)
        {
            for (int j=i+1;j<s.length();j++)
            {
                if (s.charAt(i)==s.charAt(j))
                p=false;
                
            }
        }
        if(p)
        System.out.println(s+"  is a Unique String");
        else
        System.out.println("Not a Unique String");
    }
}