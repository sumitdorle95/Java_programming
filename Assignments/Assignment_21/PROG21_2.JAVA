import java.util.*;

class logic
{
    public static void evenoddcount(int iNo) 
    {
        
        int i=0;
        int iEven=0,iOdd=0;
        
      for(i=1;i<=iNo;i++)
        {
            if((i%2)==0)
            
            {
               iEven++;
            }
            else
            {
                iOdd++;
            }
                
            
            
        }
        System.out.println(iEven+" are even numbers");
         System.out.println(iOdd+" are odd numbers");

        
    }
}

class PROG2
{
    public static void main(String A[])
    {
        int iNum=0;
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the number:");
        iNum=sc.nextInt();
         logic.evenoddcount(iNum);
         sc=null;
         System.gc();

    }
}