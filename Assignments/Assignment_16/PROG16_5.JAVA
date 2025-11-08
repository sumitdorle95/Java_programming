import java.util.*;

class logic
{
    public int digitcount(int iNo )
    {
        int count=0;
        
        int num=0;
        while(iNo!=0)
        {
           count=iNo%10;
           num++;
           iNo=iNo/10;
           
        }
         return num;

    }
}

class PROG5
{
    public static void main(String A[])
    {
        int iValue=0;
        int iRet=0;
        Scanner sobj = new Scanner(System.in);
        System.out.println("enter the number:");
        iValue=sobj.nextInt();
        logic lobj = new logic();
        iRet=lobj.digitcount(iValue);
        System.out.println(" the no of digits are "+ iRet);
       
       


    }
}