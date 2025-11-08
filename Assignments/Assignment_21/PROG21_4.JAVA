import java.util.*;

class logic
{
    public static void factcount(int iNo) 
    {
        
        int i=0,iCount=0;
        
      for(i=1;i<iNo;i++)
        {
            if((iNo%i)==0)
            
            {
               iCount++;
            }
            
               
            
            
        }
        System.out.println("total no of factors "+iCount); 
        
    }
}

class PROG4
{
    public static void main(String A[])
    {
        int iNum=0;
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the number:");
        iNum=sc.nextInt();
         logic.factcount(iNum);
         sc=null;
         System.gc();

    }
}