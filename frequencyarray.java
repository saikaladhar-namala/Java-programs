import java.util.*;
public class frequencyarray
{

	public static void main(String[] args)
	{
		
		int[] arr = {1,2,3,3,2,1,1,2,3,1,1,1,2,2,2,3,3,3,45,89,63,23};
		Arrays.sort(arr);
		int i,j;
		for(i=0;i<arr.length;i++)
		{
			int count=1;
			for(j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j]) {f:F
					count++;
				}
				else
				{
					break;
				}
			}
			i=j-1;
			if(count>1)
			System.out.println(arr[i]+"--------->"+count);
			
		}
		
	}
}
