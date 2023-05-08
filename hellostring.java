public class hellostring
{

	public static void main(String[] args)
	{
		
		System.out.println("=================");
		meth1();
		System.out.println("=================");
		meth2();
		System.out.println("=================");
		meth3();
		System.out.println("=================");
		meth4();
	}
	static void meth2() {
		
		String s="Hello All good Morning";
		String res="";
		String[] arr=s.split(" ");
		for(int i=0;i<arr.length;i++)
		{
			if(i%2!=0)
			{
				StringBuilder s2=new StringBuilder(arr[i]);
				s2.reverse();
				res=res+s2+" ";
			}
			else {
				res=res+arr[i]+" ";
						
			}
		}
		System.out.println(res);
	}
	static void meth1() {
		String s="Vital Information Resources Under Seize";
		String res="";
		String[] arr=s.split(" ");
		for(int i=0;i<arr.length;i++)
		{
			res=res+arr[i].charAt(0);
		}
		System.out.println(res);
	}
	static void meth3() {
		String s="Hello All good Morning";
		String res="";
		String[] arr=s.split(" ");
		for(int i=0;i<arr.length;i++)
		{
			if(i%2!=0)
			{
				String s1=arr[i];
				String s2="";
				for(int j=0;j<s1.length();j++)
				{
					if(Character.isUpperCase(s1.charAt(j)))
					{
						s2=s2+Character.toLowerCase(s1.charAt(j));
					}else {
						s2=s2+Character.toUpperCase(s1.charAt(j));
					}
				}
				StringBuffer sb=new StringBuffer(s2);
				res=res+sb.reverse()+" ";
			}
			else {
				res=res+arr[i]+" ";
						
			}
		}
		System.out.println(res);
		}
	static void meth4()
	{
		String s="Hello All good Morning";
		String[] arr=s.split(" ");
		String res="";
		for(int i=0;i<arr.length;i++)
		{
			if(i%2==0)
			{
				StringBuilder s1=new StringBuilder(arr[i]);
				s1.reverse();
				res=res+s1+" ";
						
			}
			else
			{
				String s2=arr[i];
				String s3="";
				for(int j=0;j<s2.length();j++)
				{
					if(Character.isUpperCase(s2.charAt(j)))
					{
						s3=s3+Character.toLowerCase(s2.charAt(j));
					}
					else {
						s3=s3+Character.toUpperCase(s2.charAt(j));
					}
				}
				res=res+s3+" ";
			}
		}
		System.out.println(res);
		
	}
	
}
