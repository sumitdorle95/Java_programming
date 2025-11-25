import java.util.*;



class logic
{
        boolean Check(int Brr[])
    {
        int iCnt=0,iFrequency=0;
        for(iCnt=0;iCnt<Brr.length;iCnt++)
            {
                if((Brr[iCnt])==11)
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





class PROG22_3
{
    public static void main(String A[])
    {
        int iSize=0;
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


        logic lobj = new logic();
        bRet=lobj.Check(Arr);

        if(bRet==true)
            {
                System.out.println("11 is present");
            }
            else
            {
                System.out.println("11 is absent");
            }

        

        sc=null;
        Arr=null;
        lobj=null;

        System.gc();

    }
    

    
}