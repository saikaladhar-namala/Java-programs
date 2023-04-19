public class multipattern
{
	public static void main(String[] args)
	{
		multipattern abj=new multipattern();
		abj.starpattern();
		abj.Hashpattern();
		
	}
	void starpattern()
	{
		for(int i=1;i<=5;i++)
		{
			if(i%2==0) {
				continue;
			}
			else {
				for(int j=5;j>=i;j--)
				{
					System.out.print(" ");
				}
				for(int k=1;k<=i;k++)
				{
					System.out.print("*"+" ");
				}
				System.out.println();
			}
		}
	}
	void Hashpattern()
	{
		for(int i=4;i>0;i--)
		{
			if(i%2==0) {
				continue;
			}
			else {
				for(int j=5;j>=i;j--)
				{
					System.out.print(" ");
				}
				for(int k=1;k<=i;k++)
				{
					System.out.print("#"+" ");
				}
				System.out.println();
			}
		}
		
	}
	
}
