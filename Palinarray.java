import java.util.Arrays;

public class Palinarray
{
	public static void main(String[] args) {
		
		int[] arr= {9,1,5,6,5,1,9};
		System.out.println(Arrays.toString(arr)+" is the first array");
		System.out.println("================");
		int[] arr1=new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			arr1[arr.length-i-1]=arr[i];
		}
		System.out.println(Arrays.toString(arr1)+" is the second array");
		if(meth1(arr1,arr))
		{
			System.out.println("The Array is Palindrome");
		}
		else {
			System.out.println("The Array is Not Palindrome");
		}
		
	}
	static boolean meth1(int [] arr1,int[] arr)
	{
		for(int j=0;j<arr.length/2;j++)
		{
			if(arr[j]!=arr1[j])
			{
				return false;
			}
		}
		return true;
	}
	
}
