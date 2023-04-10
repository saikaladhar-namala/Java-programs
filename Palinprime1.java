public class Palinprime1
{
	public static void main(String[] args)
	{
		for(int i=2;i<200;i++)
		{
			int num=i;
			int res=num;
			int sum=0;
			while(num>0)
			{
				int rem=num%10;
				sum=sum*10+rem;
				num=num/10;
			}
			if(res==sum)
			{
				
				int s=res;
				int count=0;
				for(int j=2;j<=s/2;j++)
				{
					if(s%j==0)
					{
						count++;
						break;
					}
				}
				if(count==0)
				{
					System.out.println(res);
				}
		
			}
		}
		
	}
}