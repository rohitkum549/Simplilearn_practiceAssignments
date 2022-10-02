package AssignmentsDay02;
import java.util.*;
class average
{
	int firstNumber;
	int secondNumber;
	int thirdNumber;
	public void input()
	{
		Scanner X=new Scanner(System.in);
		System.out.println("Enter The 1stNumber:");
		firstNumber=X.nextInt();
		System.out.println("Enter The 2ndNumber:");
		secondNumber=X.nextInt();
		System.out.println("Enter The 3rdNumber:");
		thirdNumber=X.nextInt();
	}
	public void  average()
	{
		float sum,averageOfNumber;
		sum=firstNumber+secondNumber+thirdNumber;
		averageOfNumber=sum/3;
		System.out.println(averageOfNumber);
//		return averageOfNumber;
	}
}
public class question_2 
{
	public static void main (String args[])
	{
		average av=new average();
//		//float average=av.average();
//		System.out.println(average);
		av.input();
		av.average();
	}
}
