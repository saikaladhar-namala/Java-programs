public class FindCommonElements
{
    public static void main(String[] args) {
        int[] arr1 = {12,89,63,45,20,13};
        int[] arr2 = {14, 45, 63, 72, 81};
        int[] common=new int[arr1.length];
        int count=0;
        for(int i=0;i<arr1.length;i++)
        {
        	
        	for(int j=0;j<arr2.length;j++)
        	{
        		if(arr1[i]==arr2[j])
        		{
        			common[count]=arr1[i];
        			count++;
        		}
        	}
        }
        for(int i=0;i<count;i++)
        {
        	System.out.print(common[i]+" ");
        }
    }
}
