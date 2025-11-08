import java.util.*;
class logic
{
    public boolean checkperfect(int iNo)
    {
        int i =0;
        int iSum=0;
        for(i=1;i<iNo;i++)
        {
            if((iNo%i)==0)
            {
                iSum=iSum+i;
            }
        }
        if(iNo==iSum)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    

}// end of logic class

class PROG3
{
    public static void main(String A[])
    {
        int iValue=0;
        boolean bRet= false;
      
        Scanner sobj = new Scanner(System.in);
        System.out.println("enter the number");
        iValue= sobj.nextInt();
        logic lobj = new logic();
        bRet=lobj.checkperfect(iValue);

        if(bRet==true)
        {
            System.out.println(iValue+" is  a perfect number");
        }
        else
        {
            System.out.println(iValue+" is not a perfect number");
        }
        
        sobj=null;
        lobj =null;
        System.gc();


    }
}