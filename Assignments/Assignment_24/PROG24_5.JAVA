import java.util.*;



class logic
{
        void DigitSum(int Brr[])
    {
        int iCnt = 0;

        for(iCnt = 0; iCnt < Brr.length; iCnt++)
        {
            int iNo = Brr[iCnt];
            int iDigit = 0,iSum=0;
            
            while(iNo != 0)
            {
                 iDigit = iNo % 10;  
                iSum = iDigit + iSum;
                iNo = iNo / 10;       
            }
    
            System.out.printf("sum of digits of %d is %d\n", Brr[iCnt], iSum);
        }
           
    }

}





class PROG24_5
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
        lobj.DigitSum(Arr);

        
            
        
            
          

        

        sc=null;
        Arr=null;
        lobj=null;

        System.gc();

    }
    

    
}