import java.util.*;

class logic
{
    public void power(int iNo1, int iNo2)
    {
        int i=0;
        int iValue=1;
        for(i=1;i<=iNo2;i++)
        {
            iValue=iValue*iNo1;
        }

       System.out.println(iValue+" is the calculated power of "+iNo1);
    }
}

class PROG5
{
    public static void main(String A [])
    {
        int iNum1=0,iNum2=0,iRet=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        iNum1=sc.nextInt();
        System.out.println("enter the power:");
        iNum2=sc.nextInt();
        logic lobj = new logic();
        lobj.power(iNum1,iNum2);
        

        sc=null;
        lobj=null;
        System.gc();

        

    }
}