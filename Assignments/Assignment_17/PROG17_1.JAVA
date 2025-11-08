import java.util.*;

class logic
{
    public int sumnum(int iNo )
    {
        int count=0;
        
        int num=0;
        while(iNo!=0)
        {
           count=iNo%10;
           num=num+count;
           iNo=iNo/10;
           
        }
         return num;

    }
}

class PROG1
{
    public static void main(String A[])
    {
        int iValue=0;
        int iRet=0;
        Scanner sobj = new Scanner(System.in);
        System.out.println("enter the number:");
        iValue=sobj.nextInt();
        logic lobj = new logic();
        iRet=lobj.sumnum(iValue);
        System.out.println(" the sum is "+ iRet);
       
        sobj=null;
        lobj =null;
        System.gc();


    }
}