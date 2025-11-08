import java.util.*;

class logic
{
    public boolean checkevenodd(int iNo )
    {
        if(iNo==0)
        {
            System.out.println("invalid");
            return false;
        }
       if((iNo%2)==0)
       {
        return true;
       }
       else
       {
        return false;
       }
    }
}

class PROG2
{
    public static void main(String A[])
    {
        int iValue=0;
        boolean bRet=false;
        Scanner sobj = new Scanner(System.in);
        System.out.println("enter the number:");
        iValue=sobj.nextInt();
        logic lobj = new logic();
        bRet=lobj.checkevenodd(iValue);
        if(iValue!=0)
        {
                        if(bRet==true)
                {
                    System.out.println("the number is even");
                }
                else
                {
                    System.out.println("the number is odd");
                }
        }
       


    }
}