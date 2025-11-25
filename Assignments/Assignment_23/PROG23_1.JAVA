import java.util.*;



class logic
{
        boolean Check(int Brr[],int iNo)
    {
        int iCnt=0,iFrequency=0;
        for(iCnt=0;iCnt<Brr.length;iCnt++)
            {
                if((Brr[iCnt])==iNo)
                {
                    iFrequency++;
                }
               

            }
            if(iFrequency>0)
                {
                    return true;
                }
                else
                {
                    return false;
                }
           
    }

}





class PROG23_1
{
    public static void main(String A[])
    {
        int iSize=0,iValue=0;
        boolean bRet=false;
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
        bRet=lobj.Check(Arr,iValue);

        if(bRet==true)
            {
                System.out.println(iValue +" is present");
            }
            else
            {
                System.out.println(iValue + " is absent");
            }

        

        sc=null;
        Arr=null;
        lobj=null;

        System.gc();

    }
    

    
}