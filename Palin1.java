public class Palin1
{
	public static void main(String[] args)
	{
		Palin1 abj=new Palin1();
		for(int i=10;i<=1000;i++)
		{
			if(palin(i))
			{
				System.out.println(i);
			}
		}	
	}
	static boolean palin(int num)
	{
		int val=num;
		int sum=0;
		while(num>0)
		{
			int rem=num%10;
			sum=sum*10+rem;
			num=num/10;
		}
		if(val==sum) {
			return true;
		}
		else {
			return false;
		}
	}
}