import java.util.*;

class logic
{
    public void checksign(int iNo)
    {
        
       
        if(iNo<0)
        {
           System.out.println("its a negative number");
        }
        else if(iNo>0)
        {
            System.out.println("its a positive number");
        }
        else
        {
            System.out.println("its a 0");

        }

        
    }
}

class PROG5
{
    public static void main(String A[])
    {
        int iValue=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number:");
        iValue=sc.nextInt();
        logic lobj = new logic();
        lobj.checksign(iValue);

        sc=null;
        lobj=null;
        System.gc();
    }
}