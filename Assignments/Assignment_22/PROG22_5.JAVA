import java.util.*;



class logic
{
        int Check(int Brr[],int iNo)
    {
        int iCnt=0,iFrequency=0;
        for(iCnt=0;iCnt<Brr.length;iCnt++)
            {
                if((Brr[iCnt])==iNo)
                {
                    iFrequency++;
                }
               

            }
           return iFrequency;
           
    }

}





class PROG22_5
{
    public static void main(String A[])
    {
        int iSize=0,iValue=0;
        int iRet=0;
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
        System.out.println("enter the no to be checked:");
        iValue=sc.nextInt();


        logic lobj = new logic();
        iRet=lobj.Check(Arr,iValue);

        System.out.println("the frequency of "+ iValue +" is :"+ iRet);


        

        sc=null;
        Arr=null;
        lobj=null;

        System.gc();

    }
    

    
}