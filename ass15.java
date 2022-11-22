import java.util.*;
class ass15
{
    public static void main()
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("what do you want to check");
        System.out.println("1.Perfect Square");
        System.out.println("2.Check if string has a character");
        System.out.println("3.Check if special characters are present");
        int x=sc.nextInt();
        switch(x)
        {
            case 1:
            System.out.println("Enter a Number to Check if Perfect Square");    
            int z=sc.nextInt();
            display(z);
            break;
            case 2:
             System.out.println("Enter String and a character ");
             String an=sc.next();
             char c = sc.next().charAt(0); 
             display(an,c);
             break;
             case 3:
             System.out.println("Enter A string to check for Special chARACTERS");
             String se=sc.next();
             display(se);
             break;
             default:
                 System.out.println("Wrong input try again later");
                 break;
            
        }
    }
    static void display (int num)
    {
      int sqr = (int)Math.sqrt(num);
       if(sqr*sqr == num)
       System.out.println("This is a perfect square: "+num);
       else
       System.out.println("This isnt a Perfect NuMBER");
    }
    static void display(String str,char ch)
    {
        for (int i=0;i<=str.length();i++)
        {
            if(str.charAt(i)==ch)
            {
                System.out.println(str+" Contains "+ch);
                break;
            }
            else
            {
                System.out.println("Does not contain"+ch);
               break;
            }
            
        }
        
    }
    static void display(String str)
    {
       int count=0;
          for (int i = 0; i < str.length(); i++) {
 
            
            if (!Character.isDigit(str.charAt(i))
                && !Character.isLetter(str.charAt(i))
                && !Character.isWhitespace(str.charAt(i))) {
                
                   count++;
            }
        }
 
        
        if(count==0)
 
         {
             System.out.println(
                "No Special Characters found.");
         }
            
        else
 
        
            System.out.println("Characters found");
}
}

