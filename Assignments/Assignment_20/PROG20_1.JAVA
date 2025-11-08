import java.util.*;

class logic
{
    public static void evensum(int iNo) 
    {
        int i=0;
        int iSum=0;
        for(i=1;i<=iNo;i++)
        {
            if((i%2)==0)
            {
                iSum=iSum+i;
            }
        }
        System.out.println("the sum of even numbers upto "+iNo+" is " + iSum);
    }
}

class PROG1
{
    public static void main(String A[])
    {
        int iNum=0;
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the number:");
        iNum=sc.nextInt();
         logic.evensum(iNum);
         sc=null;
         System.gc();

    }
}