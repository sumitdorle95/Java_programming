import java.util.*;



class logic
{
        int findmin(int Brr[])
    {
        int iCnt=0,iMin=Brr[0];
        for(iCnt=0;iCnt<Brr.length;iCnt++)
            {
                if((Brr[iCnt])<iMin)
                {
                   iMin=Brr[iCnt];
                }
               
               

            }
            return iMin;
           
    }

}





class PROG24_2
{
    public static void main(String A[])
    {
        int iSize=0;
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
            
            System.out.println();

        logic lobj = new logic();
        iRet=lobj.findmin(Arr);

        
            
        System.out.println(iRet + " is the  smallest of all elements");
            
          

        

        sc=null;
        Arr=null;
        lobj=null;

        System.gc();

    }
    

    
}