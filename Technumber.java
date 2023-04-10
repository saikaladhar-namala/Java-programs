import java.util.Scanner;

public class Technumber
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=sc.nextInt();
		int res=num;
		int sum=0;
		while(num>0)
		{
			int rem=num%100;
			sum=sum+rem;
			num=num/100;
		}
		int sumproduct=sum*sum;
		if(sumproduct==res)
		{
			System.out.println("Technology Number");
		}
		else {
			System.out.println("Not Technology");
		}
	}
}
/*Enter the number: 
2025        

Technology Number*

Enter the number: 
3025

Technology Number*/