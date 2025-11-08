import java.util.*;

class logic
{
    public void evenodddisplay(int iNo)
    {
        int i=0;
        int iEven =0;
        int iOdd =0;
        if(iNo<0)
        {
            iNo=-iNo;
        }

        while(iNo!=0)
        {
            i=iNo%10;
            if((i%2)==0)
            {
               iEven=iEven+i;
                
            }
            else
            {
                iOdd=iOdd+i;
            }
            iNo=iNo/10;
        }
        System.out.println(iEven + " is the sum of even digits");
         System.out.println(iOdd + " is the sum of odd digits");

    }
}

class PROG4
{
    public static void main(String A[])
    {
        int iValue=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number:");
        iValue=sc.nextInt();
        logic lobj = new logic();
        lobj.evenodddisplay(iValue);

        sc=null;
        lobj=null;
        System.gc();
    }
}