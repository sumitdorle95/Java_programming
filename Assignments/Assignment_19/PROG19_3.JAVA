import java.util.*;

class logic
{
    public void divisibility(int iNo)
    {
        if(((((iNo%5)==0)&&(iNo%11)==0)))
        {
            System.out.println(iNo+" is divisible by both 5 & 11 ");
        }
        else
        {
             System.out.println(iNo+" is not divisible by both 5 & 11 ");
        
        }
    }
}

class PROG3
{
    public static void main(String A[])
    {
        int iNum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        iNum=sc.nextInt();
        logic lobj = new logic();
        lobj.divisibility(iNum);

        sc=null;
        lobj=null;
        System.gc();
    }
}