//		Write a Java Program to sort numeric array and a string array.
package AssignmentsDay01;
import java.util.*;
public class question_1 
{
	public static void main (String args[])
	{
		System.out.println("Enter the length of Array:");
		Scanner X=new Scanner(System.in);
		int length=X.nextInt();
		int arr[]=new int[length];
		for(int i=0;i<length;i++)
		{
			arr[i]=X.nextInt();
		}
		int temp=0;
        //int arr[]={5,9,2,5,8,1,3};
        for(int i=0;i<arr.length-1;i++)
        {
        	for(int j=i+1;j<arr.length;j++)
        	{
        		if(arr[i]>arr[j])
        		{
        			temp=arr[i];
        			arr[i]=arr[j];
        			arr[j]=temp;
        		}
        	}
        }
        for(int i=0;i<arr.length;i++)
        {
        	System.out.print(arr[i]+" ");
        }
        X.close();
	}
}
