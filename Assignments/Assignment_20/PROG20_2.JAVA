import java.util.*;

class logic
{
    public static void display(int iNo) 
    {
        int i=0;
        
        for(i=iNo;i>-1;i--)
        {
            System.out.print(i+" ");
        }
        
    }
}

class PROG2
{
    public static void main(String A[])
    {
        int iNum=0;
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the number:");
        iNum=sc.nextInt();
         logic.display(iNum);
         sc=null;
         System.gc();

    }
}