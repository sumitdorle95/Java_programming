import java.util.*;



class logic
{
    int CountEven(int Brr[])
    {
        int iCnt=0,iFrequency=0;
        for(iCnt=0;iCnt<Brr.length;iCnt++)
            {
                if((Brr[iCnt]%2)==0)
                {
                    iFrequency++;
                }
            }
            return iFrequency;
    }

}





class PROG22_1
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
        iRet=lobj.CountEven(Arr);

        System.out.println("the frequency of even numbers is :"+iRet);

        sc=null;
        Arr=null;
        lobj=null;

        System.gc();

    }
    

    
}