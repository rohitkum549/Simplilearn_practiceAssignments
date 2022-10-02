package AssignmentsDay01;

public class question_8 {

	public static void main(String[] args) 
	{
		int arr1[]= {2,5,7,9,11};
		int arr2[]= {2,7,7,9,11}; 
		int length1=arr1.length;
		int length2=arr2.length;
		int i=0;
		boolean b=true;
		if(length1==length2)
		{
			for( i=0;i<length1;i++)
			{
				if(arr1[i]!=arr2[i])
				{
					b=false;
				}
				
			}
//			String temp=(i==length1)?"Two array is equal":"Two array is not equal";
//			System.out.println(temp);
			if(b)
				System.out.println("Two array is equal");
			else
				System.out.println("Two array is not equal");

		}
	}

}
