import java.util.*;



class logic
{
        void Range(int Brr[],int iStart, int iEnd)
    {
        int iCnt=0,iCount=0;
        for(iCnt=0;iCnt<Brr.length;iCnt++)
            {
                if(((Brr[iCnt])>iStart)&&(Brr[iCnt]<iEnd))
                {
                   System.out.print(Brr[iCnt]+"\t");
                   iCount++;
                }
               
               

            }
        if(iCount==0)
            {
                System.out.println("no elements in the range found");
            } 
           
    }

}





class PROG23_4
{
    public static void main(String A[])
    {
        int iSize=0,iValue=0,iValue2=0;
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
            System.out.println("enter the range:");
            iValue=sc.nextInt();
            iValue2=sc.nextInt();
            System.out.println();


        logic lobj = new logic();
        lobj.Range(Arr,iValue,iValue2);

        
            
       
            
          

        

        sc=null;
        Arr=null;
        lobj=null;

        System.gc();

    }
    

    
}