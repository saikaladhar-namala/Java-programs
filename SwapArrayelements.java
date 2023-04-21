import java.util.*;
public class SwapArrayelements
{
    public static void main(String[] args)
    {
        int[] arr1 = {1,2,3,4,5,6};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the First index val: ");
        int first=sc.nextInt();
        System.out.println("Enter the Second index val :");
        int second =sc.nextInt();
        System.out.println(Arrays.toString(swapnumarray(arr1,first,second)));
    }
    static int[] swapnumarray(int[] arr1,int first,int second)
    {
    	int n1=0; int n2=0;
    	for(int i=0;i<arr1.length;i++)
    	{
    		if(arr1[i]==first) {
        		n1=i;
        	}
        	else if(arr1[i]==second)
        	{
        		n2=i;
        	}
    	}
    	int temp=arr1[n1];
		arr1[n1]=arr1[n2];
		arr1[n2]=temp;
    	return arr1;
    }
   
}