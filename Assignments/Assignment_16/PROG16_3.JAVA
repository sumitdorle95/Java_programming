import java.util.*;

class logic
{
    public int factorial(int iNo )
    {
        int iCnt=0;
        int product=1;
        for(iCnt=iNo;iCnt>0;iCnt--)
        {
            product=product*iCnt;
        }
         return product;

    }
}

class PROG3
{
    public static void main(String A[])
    {
        int iValue=0;
        int bRet=0;
        Scanner sobj = new Scanner(System.in);
        System.out.println("enter the number:");
        iValue=sobj.nextInt();
        logic lobj = new logic();
        bRet=lobj.factorial(iValue);
        System.out.println("the factorial is "+ bRet);
       
       


    }
}