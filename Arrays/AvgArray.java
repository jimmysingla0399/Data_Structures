import java.util.*;
public class AvgArray
{
    public static void main(String args[])
    {
        int sum=0;
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr1[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr1[i]=s.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            sum+=arr1[i];
        }
        for(int i=n-1;i>=0;i--)
        {
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
        double avg;
        avg=(double)sum/n;
        System.out.println(avg);

    }

}
