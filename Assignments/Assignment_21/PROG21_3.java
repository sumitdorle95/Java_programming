import java.util.*;

class logic
{
    public static void factordisplay(int iNo) 
    {
        
        int i=0;
        
      for(i=1;i<iNo;i++)
        {
            if((iNo%i)==0)
            
            {
               System.out.println(i);
            }
            
                
            
            
        }
        
    }
}

class PROG3
{
    public static void main(String A[])
    {
        int iNum=0;
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the number:");
        iNum=sc.nextInt();
         logic.factordisplay(iNum);
         sc=null;
         System.gc();

    }
}