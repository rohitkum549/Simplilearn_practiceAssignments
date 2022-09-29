// Write a Java Program to Calculate the avg. value of Array elements.
package AssignmentsDay01;
import java.util.*;
public class question_2 
{
	public static void main (String args[])
	{
		System.out.println("Enter the Length of Array:");
		Scanner X=new Scanner(System.in);
		int length=X.nextInt();
		int arr[]=new int [length];
		System.out.println("Enter the Number for Array:");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=X.nextInt();
		}
		//int arr[]= {3,4,5,7,9};
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		float div=arr.length;
		float Average=sum/div;
		System.out.println("Average:-\t"+Average);
		X.close();
	}
}
