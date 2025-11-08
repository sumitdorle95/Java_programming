import java.util.*;

class logic
{
    
    public boolean palindrome(int iNo )
    {
        int count=0;
        int real =iNo;
        int num=0;
        while(iNo!=0)
        {
           count=iNo%10;
           num=num*10+count;
           iNo=iNo/10;
           
        }
        if(num==real)
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
        bRet=lobj.palindrome(iValue);
        
        if(bRet==true)
        {
            System.out.println(iValue +" is a palindrome "  );
        }
        else
        {
            System.out.println(iValue +" is not a palindrome " );
        }
       
        sobj=null;
        lobj =null;
        System.gc();
       


    }
}