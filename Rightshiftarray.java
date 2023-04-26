import java.util.Arrays;
import java.util.Scanner;

public class Rightshiftarray {
    
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the right shift num: ");
		int[] arr= {10,20,30,40,50,60,70,80,90};
		int n=sc.nextInt();
		for(int j=1;j<=n;j++)
		{
			int temp=arr[arr.length-1];
			for(int i=arr.length-1;i>0;i--)
			{
				arr[i]=arr[i-1];
			}
			arr[0]=temp;
		}
		System.out.println(Arrays.toString(arr));
	}
}
