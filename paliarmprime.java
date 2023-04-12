public class paliarmprime
{
	public static void main(String[] args) {
		
		int num=175468;
		int prime=num%100;
		int count=0;
		for(int j=1;j<=prime;j++)
		{
			if(prime%j==0) {
				count++;
			}
		}
		if(count==2)
		{
			System.out.println(prime+" is Prime");
			System.out.println("==================");
		}
		else
		{
			System.out.println(prime+" not Prime");
			System.out.println("==================");
		}
		int palin=num/10000;
		int palinres=palin;
		int sum=0;
		while(palin>0)
		{
			int rem=palin%10;
			sum=sum*10+rem;
			palin/=10;
		}
		if(sum==palinres) {
			System.out.println(palinres+" is a Palin");
			System.out.println("=====================");
		}
		else {
			System.out.println(palinres+" not a Palin");
			System.out.println("=====================");
		}
		int mid=num/100;
		int arm=mid%100;
		int pro=1; int res1=arm;
		int sum1=0;
		while(arm>0)
		{
			int rem=arm/10;
			sum1=sum1+rem*rem;
			arm=arm/10;
		}
		if(sum1==res1)
		{
			System.out.println(res1+" is a Armstromg");
		}
		else {
			System.out.println(res1+" not a Armstrong");
		}
		
	}
}
