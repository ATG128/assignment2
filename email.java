

import java.util.*;
public class email 
{
   public static void main()
   {
      Scanner sc = new Scanner(System.in);
      int t,flag=0;System.out.println("\tRules for an email-id to be valid:");
      System.out.println("1) The email-id should be in lowercase.");
      System.out.println("2) '@' sign should be present only once (not at the start or ending)");
      System.out.println("3) The email-id should end with '@gmail.com'");
      System.out.println("4) The length before '@gmail.com' should be max:20 and min:1");
      System.out.println("5) Only '$ _ .' signs are allowed in the email-id");
      System.out.println("6) Maximum 5 chances to input.");
      System.out.println("Example Email-ID: abc.xys@gmail.com");
      System.out.println("Type 'Enter' if you have read these rules to proceed.");
      String q=sc.nextLine();
         while(true)
         {
         t=1;
         System.out.println("Enter email ID");
         while(t<=5)
         {
            String s= sc.next();
            for(int i=0;i<s.length();i++)
            {
                char ch = s.charAt(i);
                if(Character.isUpperCase(ch))
                {
                    flag=1;
                    break;
                }   
            }
            if(flag==1)
            {
                t++;
                System.out.println("\f Try again");
                continue;
            }
            int at = s.indexOf('@');
            if(at!=s.lastIndexOf('@')||s.endsWith("@gmail.com")==false||s.substring(0,at).length()>20)
            {
                t++;
                System.out.println("\f Try again");
                continue;
            }
            String temp="_$.";
            for(int i=0;i<at;i++)
            {
                char ch=s.charAt(i);
                if(temp.indexOf(ch)==-1&&Character.isLetterOrDigit(ch)==false)
                {
                    t++;
                    System.out.println("\f Try again");
                    continue;
                }
            }
            System.out.println("Valid email ID");
            System.exit(0);
         }
         System.out.println("\f Wait for 20 seconds");
         for(long i=1l;i<=60606060606l;i++);
      }
   }
}
