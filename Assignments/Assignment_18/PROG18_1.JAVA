import java.util.*;

class logic
{
    
    public void checkprime(int iNo)
    {
        boolean bflag =true;
        int icnt =0;
        for(icnt=2;icnt<=(iNo/2);icnt++)
        {
            if((iNo%icnt)==0)
            {
                bflag =false;
                break;
            }
            
        }

        if(bflag==true)
        {
            System.out.println(iNo+ " is a prime number");
        }
        else
        {
            System.out.println(iNo+ " is not a prime number");
        }
        

    }
}

class PROG1
{
    public static void main(String A[])
    {
        int iValue1=0,iValue2=0,iValue3=0;
        
        Scanner sobj = new Scanner(System.in);
        System.out.println("enter the number:");
        iValue1=sobj.nextInt();
        
        logic lobj = new logic();
        lobj.checkprime(iValue1);
        
        
       
       
       


    }
}