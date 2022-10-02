package AssignmentsDay01;

public class question_10 
{
	public static void main (String args[])
	{
		int arr[]= {1,2,3,4,5,6,7,8};
		int missing=0;
		int sumn=(8*(8-1))/2, sum=0;
		for(int i=arr.length-1;i>0;i--)
		{
			sum+=arr[i];
//			int temp=arr[i]-arr[i-1];
//			if(temp!=1)
//			{
//				missing=arr[i-1]+1;
//			}
		}
		System.out.println(sumn-sum);
	}
}
