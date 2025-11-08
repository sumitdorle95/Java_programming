import java.util.*;

class logic
{
    public static void divisibility(int iNo) 
    {
        
        int i=0;
        
      for(i=1;i<=iNo;i++)
        {
            if((((i%2)==0)&&(i%3)==0))
            
            {
                System.out.println(i); 
            }
            
               
            
            
        }
       
        
    }
}

class PROG5
{
    public static void main(String A[])
    {
        int iNum=0;
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the number:");
        iNum=sc.nextInt();
         logic.divisibility(iNum);
         sc=null;
         System.gc();

    }
}