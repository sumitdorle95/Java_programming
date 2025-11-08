import java.util.*;

class logic
{
    
    public void findmin(int iNo1, int iNo2 ,int iNo3)
    {
        
      
        if((iNo1<iNo2)&&(iNo1<iNo3))
        {
            System.out.println(iNo1+" is the smallest number");
           
        }
        else if((iNo1>iNo2)&&(iNo3>iNo2))
        {
              System.out.println(iNo2+" is the smallest number");
             
        }
        else if ((iNo1>iNo3)&&(iNo2>iNo3))
        {
            System.out.println(iNo3+" is the smallest number");
        }
        

    }
}

class PROG4
{
    public static void main(String A[])
    {
        int iValue1=0,iValue2=0,iValue3=0;
        
        Scanner sobj = new Scanner(System.in);
        System.out.println("enter the number:");
        iValue1=sobj.nextInt();
         iValue2=sobj.nextInt();
         iValue3=sobj.nextInt();
        logic lobj = new logic();
        lobj.findmin(iValue1,iValue2,iValue3);
        
        
        sobj=null;
        lobj =null;
        System.gc();
       
       


    }
}