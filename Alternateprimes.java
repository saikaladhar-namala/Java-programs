import java.util.*;
public class Alternateprimes
{
	public static void main(String[] args)
{
	ArrayList<Integer> arr=new ArrayList<>();
	for(int i=1;i<=50;i++)
	{
		int count=0;
		for(int j=1;j<=i;j++)
		{
			if(i%j==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.print(i+" ");
			arr.add(i);
		}
			
	}
	System.out.println();
	System.out.println("The list of Prime is: "+arr);
	for(int k=0;k<arr.size();k=k+2)
		{
			System.out.print(arr.get(k)+" ");
		}
}

}