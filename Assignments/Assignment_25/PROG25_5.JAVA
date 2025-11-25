import java.util.*;
 public class logic
 {
    public void Divisibilityby11(int Brr[])
    {
        int iCnt=0,iCount=0;
        for(iCnt=0;iCnt<Brr.length;iCnt++)
            {
                if((Brr[iCnt]%11)==0)
                    {
                        System.out.print(Brr[iCnt]+"\t");
                        iCount++;
                    }
                

                   
            }
            if(iCount==0)
                {
                    System.out.print("NO ELEMENTS FOUND");
                }
           
    }

 }



 class PROG25_5
 {
    public static void main(String A[])
    {
        int Arr[]={};
        int iValue=0,iRet=0,i=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of elements:");
        iValue=sc.nextInt();
        Arr= new int[iValue];
        System.out.println("enter the  elements:");
        for(i=0;i<Arr.length;i++)
            {
                Arr[i]=sc.nextInt();
            }

            logic lobj = new logic();
            System.out.println();
            lobj.Divisibilityby11(Arr);
            

            sc=null;
            lobj=null;
            Arr=null;
            

            System.gc();

            
    }
 }