import java.util.*;
 public class logic
 {
    public int Difference(int Brr[])
    {
        int iCnt=0,iEven=0,iOdd=0;
        for(iCnt=0;iCnt<Brr.length;iCnt++)
            {
                if((Brr[iCnt]%2)==0)
                    {
                        iEven=iEven+Brr[iCnt];
                    }
                else
                    {
                        iOdd=iOdd+Brr[iCnt];
                    }
            }

            return (iEven-iOdd);

    }

 }



 class PROG25_1
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
            iRet=lobj.Difference(Arr);

            System.out.println("The difference b/w even & odd elements is " + iRet);
            sc=null;
            lobj=null;
            Arr=null;
            sc.close();

            System.gc();
    }
 }