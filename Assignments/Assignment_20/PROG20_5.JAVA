import java.util.*;

class logic
{
    public static void SMALLEST(int iNo) 
    {
        
        int iSmallest=9;
        int iDigit=0;
        while(iNo!=0)
        {
            iDigit=iNo%10;
            if(iSmallest>iDigit)
            {
                iSmallest=iDigit;
            }
            
                
            
            iNo=iNo/10;
        }
        System.out.println("the smallest  digit  is " + iSmallest);
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
         logic.SMALLEST(iNum);
         sc=null;
         System.gc();

    }
}