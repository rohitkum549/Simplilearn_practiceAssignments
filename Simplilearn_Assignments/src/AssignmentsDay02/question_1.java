package AssignmentsDay02;
import java.util.*;
class smallest
{
	public int checkSmallest(int a, int b, int c)
	{
		int smallest=0;
		int temp=0;
		temp=a<b?a:b;
		smallest=temp<c?temp:c;
		return smallest;
	}
}
public class question_1 
{
	public static void main (String args[])
	{
		
		System.out.println("Enter the 1st Number:");
		Scanner X=new Scanner(System.in);
		int firstNumber=X.nextInt();
		System.out.println("Enter the 2nd Number:");
		int secondNumber=X.nextInt();
		System.out.println("Enter the 3rd Number:");
		int thirdNumber=X.nextInt();
//		question_1 q=new question_1();
		smallest s=new smallest();
		int smallestNumber=s.checkSmallest(firstNumber,secondNumber,thirdNumber);
		System.out.println(smallestNumber+" The smallest:");
		X.close();
	}
}
