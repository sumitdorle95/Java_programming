import java.util.*;

class logic
{
    public void odddisplay(int iNo)
    {
        int i=1;
        if(iNo<0)
        {
            iNo=-iNo;
        }

        for(i=1;i<=iNo;i++)
        {
            if((i%2)!=0)
            {
                System.out.println(i);
                
            }
        }
    }
}

class PROG3
{
    public static void main(String A[])
    {
        int iValue=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number:");
        iValue=sc.nextInt();
        logic lobj = new logic();
        lobj.odddisplay(iValue);

        sc=null;
        lobj=null;
        System.gc();
    }
}