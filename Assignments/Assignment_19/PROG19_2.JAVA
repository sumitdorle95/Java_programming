import java.util.*;
class logic
{
    public void grade(int iNo)
    {
        if(iNo<35)
        {
            System.out.println("FAIL");
        }
        else if((iNo>35)&&(iNo<=60))
        {
             System.out.println("YOUR GRADE IS C");
        }
        else if((iNo>60)&&(iNo<=75))
        {
             System.out.println("YOUR GRADE IS B");
        }
        else if((iNo>75)&&(iNo<=85))
        {
             System.out.println("YOUR GRADE IS B+");
        }
        else if((iNo>85)&&(iNo<=90))
        {
             System.out.println("YOUR GRADE IS A");
        }
        else
        {
             System.out.println("YOUR GRADE IS A+");
        }

    }
}


class PROG2
{
    public static void main(String A[])
    {
        int iMarks=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER YOUR MARKS:");
        iMarks=sc.nextInt();
        logic lobj = new logic();
        lobj.grade(iMarks);

        sc=null;
        lobj=null;
        System.gc();
    }
}