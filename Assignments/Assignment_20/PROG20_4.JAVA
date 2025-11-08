import java.util.*;

class logic
{
    public static void LARGEST(int iNo) 
    {
        
        int iLargest=0;
        int iDigit=0;
        while(iNo!=0)
        {
            iDigit=iNo%10;
            if(iLargest<iDigit)
            {
                iLargest=iDigit;
            }
            
                
            
            iNo=iNo/10;
        }
        System.out.println("the largest  digit  is " + iLargest);
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
         logic.LARGEST(iNum);
         sc=null;
         System.gc();

    }
}