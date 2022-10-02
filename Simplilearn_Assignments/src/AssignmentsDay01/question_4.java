//WAP to find the duplicate values of an array of integer values
package AssignmentsDay01;
import java.util.*;
public class question_4 
{
	public static void main (String args[])
	{
//		System.out.println("Enter the Length");
//		Scanner X=new Scanner (System.in);
//		int length=X.nextInt();
//		System.out.println("Enter the the Array Element");
//		int arr[]=new int [length];
//		for(int i=0;i<arr.length;i++)
//		{
//			arr[i]=X.nextInt();
//		}
		int arr[]= {5,2,7,7,5};
		int count=arr.length,c=0;
		int duplicateStore[]=new int [count];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					duplicateStore[i]=arr[i];
//					c++;
					System.out.println("Duplicate Elements are:"+arr[i]);
				}
			}
		}
//		System.out.println(c);
		for(int i=0;i<duplicateStore.length;i++)
		{
			System.out.print(duplicateStore[i]);
		}
//		System.out.println(count);
	}
}
