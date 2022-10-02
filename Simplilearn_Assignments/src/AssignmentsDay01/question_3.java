//Write a Java program to find the maximum and minimum value of an array.
package AssignmentsDay01;
import java.util.*;
public class question_3 
{
	public static void main (String args[])
	{
		System.out.println("Enter the Length :");
		Scanner X=new Scanner (System.in);
		int Length=X.nextInt();
		int arr[]=new int [Length];
		System.out.println("Enter the Array Element:");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=X.nextInt();
		}
		//int arr[]= {52,32,19,72,25,5,47};
		int Max=arr[0];
		int Min=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>Max)
			{
				Max=arr[i];
			}
			else if(arr[i]<Min)
			{
				Min=arr[i];
			}
		}
		System.out.println(Max+"\n"+Min);
		X.close();
	}
}
