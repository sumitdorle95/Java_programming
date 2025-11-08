import java.util.*;

class logic
{
    
    public boolean findmax(int iNo1, int iNo2 )
    {
        
      
        if(iNo1>iNo2)
        {
            return true;
           
        }
        else
        {
             return false;
             
        }
        

    }
}

class PROG3
{
    public static void main(String A[])
    {
        int iValue1=0,iValue2=0;
        boolean bRet=false;
        Scanner sobj = new Scanner(System.in);
        System.out.println("enter the number:");
        iValue1=sobj.nextInt();
         iValue2=sobj.nextInt();
        logic lobj = new logic();
        bRet=lobj.findmax(iValue1,iValue2);
        
        if(bRet==true)
        {
            System.out.println(iValue1 +" is  greater than " + iValue2 );
        }
        else
        {
            System.out.println(iValue2 +" is greater than " + iValue1 );
        }
       
        sobj=null;
        lobj =null;
        System.gc();
       


    }
}