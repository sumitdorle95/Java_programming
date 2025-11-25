import java.util.*;



class logic
{
        int findmax(int Brr[])
    {
        int iCnt=0,iMax=Brr[0];
        for(iCnt=0;iCnt<Brr.length;iCnt++)
            {
                if((Brr[iCnt])>iMax)
                {
                   iMax=Brr[iCnt];
                }
               
               

            }
            return iMax;
           
    }

}





class PROG24_1
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
        iRet=lobj.findmax(Arr);

        
            
        System.out.println(iRet + " is the  largest of all elements");
            
          

        

        sc=null;
        Arr=null;
        lobj=null;

        System.gc();

    }
    

    
}