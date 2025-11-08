import java.util.*;

class logic
{
    public int reversenum(int iNo )
    {
        int count=0;
        
        int num=0;
        while(iNo!=0)
        {
           count=iNo%10;
           num=num*10+ count;
           iNo=iNo/10;
           
        }
         return num;

    }
}

class PROG4
{
    public static void main(String A[])
    {
        int iValue=0;
        int iRet=0;
        Scanner sobj = new Scanner(System.in);
        System.out.println("enter the number:");
        iValue=sobj.nextInt();
        logic lobj = new logic();
        iRet=lobj.reversenum(iValue);
        System.out.println(" the reverse is "+ iRet);
       
       


    }
}