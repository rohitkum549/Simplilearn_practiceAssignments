package AssignmentsDay01;

public class question_7 {

	public static void main(String[] args) 
	{
		int arr[]= {2,7,4,-5,11,5,20};
		int specifiedNumber=15;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]+arr[j]==specifiedNumber)
				{
					System.out.println("Pair of elements: "+arr[i]+"+"+arr[j]+"="+specifiedNumber);
				}
			}
		}
	}

}

