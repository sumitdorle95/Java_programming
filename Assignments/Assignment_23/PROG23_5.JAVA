import java.util.*;



class logic
{
        int sum(int Brr[])
    {
        int iCnt=0,iSum=0;
        for(iCnt=0;iCnt<Brr.length;iCnt++)
            {
                if((Brr[iCnt]%2)!=0)
                {
                   iSum=iSum+Brr[iCnt];
                }
               
               

            }
            return iSum;
           
    }

}





class PROG23_5
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
        iRet=lobj.sum(Arr);

        
            
        System.out.println(iRet + " is the  sum of all odd elements");
            
          

        

        sc=null;
        Arr=null;
        lobj=null;

        System.gc();

    }
    

    
}