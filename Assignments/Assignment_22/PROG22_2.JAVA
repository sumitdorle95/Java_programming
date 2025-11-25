import java.util.*;



class logic
{
    int Difference(int Brr[])
    {
        int iCnt=0,iFrequency=0,iFrequency2=0;
        for(iCnt=0;iCnt<Brr.length;iCnt++)
            {
                if((Brr[iCnt]%2)==0)
                {
                    iFrequency++;
                }
                else
                {
                    iFrequency2++;
                }

            }
            return (iFrequency-iFrequency2);
    }

}





class PROG22_2
{
    public static void main(String A[])
    {
        int iSize=0,iRet=0;
        int Arr[]={};
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of elements:");
        iSize = sc.nextInt();
        Arr = new int[iSize];

        System.out.println("enter the elements:");
        int i =0;
        for(i=0;i<Arr.length;i++)
            {
                Arr[i]=sc.nextInt();
            }


        logic lobj = new logic();
        iRet=lobj.Difference(Arr);

        System.out.println("the difference in the frequency of even & odd numbers is :"+iRet);

        sc=null;
        Arr=null;
        lobj=null;

        System.gc();

    }
    

    
}