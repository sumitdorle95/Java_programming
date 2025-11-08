import java.util.*;

class logic
{
    public void display(int iNo)
    {
        int i=0;
        while(iNo!=0)
        {
            i=iNo%10;
            System.out.println(iNo+" is the original value");
             System.out.println(i+" is the digit");
             iNo=iNo/10;

        }
    }
}

class PROG4
{
    public static void main(String A[])
    {
        int iNum=0;
        Scanner sc= new Scanner (System.in);
        System.out.println("enter the number:");
        iNum=sc.nextInt();
        logic lobj = new logic();
        lobj.display(iNum);
        sc=null;
        lobj=null;
        System.gc();
    }
}