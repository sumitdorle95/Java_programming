import java.util.*;



class logic
{
        int Check(int Brr[],int iNo)
    {
        int iCnt=0;
        for(iCnt=Brr.length-1;iCnt>-1;iCnt--)
            {
                if((Brr[iCnt])==iNo)
                {
                   return iCnt;
                }
               
               

            }
            return -1;
           
    }

}





class PROG23_3
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

        
            
        System.out.println(iRet + " is the  index of last occurence of" + iValue);
            
          

        

        sc=null;
        Arr=null;
        lobj=null;

        System.gc();

    }
    

    
}