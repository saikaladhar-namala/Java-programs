
import java.util.Arrays;
import java.util.Scanner;

public class nextgreaternum
{

	public static void main(String[] args) {
		
		int[] arr= {12,45,78,96,23,25,32};
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			
			for(int j=i+1;j<arr.length;j++)
			{
				
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("Enter the num: ");
		int num=sc.nextInt();
		for(int i=0;i<arr.length;i++)
		{
			if(num==arr[i])
			{
				System.out.println(arr[i+1]);
			}
			else if(num==arr[arr.length-1]) {
				System.out.println("It is the Last Highest Elemnt in Array");
				break;
			}
		}
		
	}
}
