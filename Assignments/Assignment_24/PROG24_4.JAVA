import java.util.*;



class logic
{
        void Digits(int Brr[])
    {
        int iCnt=0,iCount=0;
        for(iCnt=0;iCnt<Brr.length;iCnt++)
            {
                if(((Brr[iCnt])<1000)&&(Brr[iCnt]>99))
                {
                   System.out.println(Brr[iCnt]);
                    iCount++;
                }
               
               

            }
        if(iCount==0)
            {
                System.out.println("no elements with 3 digits found");
            }   
           
    }

}





class PROG24_4
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
        lobj.Digits(Arr);

        
            
        
            
          

        

        sc=null;
        Arr=null;
        lobj=null;

        System.gc();

    }
    

    
}