import java.util.*;

class logic
{
    public int calculatesum(int iNo )
    {
        int iCnt =0;
        int iSum =0;
        for(iCnt=0;iCnt<=iNo;iCnt++)
        {
            iSum=iSum+iCnt;
        }
        return iSum;
    }
}

class PROG1
{
    public static void main(String A[])
    {
        int iValue=0,iRet=0;
        Scanner sobj = new Scanner(System.in);
        System.out.println("enter the number:");
        iValue=sobj.nextInt();
        logic lobj = new logic();
        iRet=lobj.calculatesum(iValue);
       System.out.println("The sum of first " + iValue + " numbers is " + iRet);


    }
}