import java.util.*;

class logic
{
    public void leapyear(int iNo)
    {
        if((iNo%4)==0)
        {
            System.out.println(iNo+ " is a leap year");
        }
        else
        {
             System.out.println(iNo+ " is not a leap year");
        }
    }
}


class PROG1
{
    public static void main(String A[])
    {
        int year=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE YEAR:");
        year=sc.nextInt();
        logic lobj = new logic();
        lobj.leapyear(year);

        sc=null;
        lobj=null;
        System.gc();
    }
}