import java.util.*;

class logic
{
    
    public void table(int iNo)
    {
        int num =1;
        int icnt =0;
        for(icnt=1;icnt<=10;icnt++)
        {
            num = iNo*icnt;
            System.out.println(num+"\t");
        }
        

    }
}

class PROG5
{
    public static void main(String A[])
    {
        int iValue1=0,iValue2=0,iValue3=0;
        
        Scanner sobj = new Scanner(System.in);
        System.out.println("enter the number:");
        iValue1=sobj.nextInt();
        
        logic lobj = new logic();
        lobj.table(iValue1);
        
        
        sobj=null;
        lobj =null;
        System.gc();
       
       


    }
}