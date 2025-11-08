import java.util.*;

class logic
{
    public static void multiply(int iNo) 
    {
        
        int iproduct=1;
        int iDigit=0;
        while(iNo!=0)
        {
            iDigit=iNo%10;
            
            {
                iproduct=iproduct*iDigit;
            }
            
                
            
            iNo=iNo/10;
        }
        System.out.println("the product  of digits  is " + iproduct);
    }
}

class PROG1
{
    public static void main(String A[])
    {
        int iNum=0;
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the number:");
        iNum=sc.nextInt();
         logic.multiply(iNum);
         sc=null;
         System.gc();

    }
}