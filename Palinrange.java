import java.util.Scanner;

public class Palinrange
{
	public static void main(String[] args)
	{
		int start=141;int end=500;
		long sum=0;
		for(int i=start;i<=end;i++)
		{
			int res;
			//int num=151;
			res=i;
			int result=0;
			while(res>0)
			{
				int rem=res%10;
				result=result*10+rem;
				res=res/10;
				sum=sum+result;
						
			}
			if(result==i)
			{
				System.out.println(i+" is a Palindrome");
			}
			
		}
		System.out.println("=======================");
		System.out.println("The Final Sum is: "+sum);
	}
}