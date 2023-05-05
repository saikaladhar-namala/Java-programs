public class UpperLower
{
	public static void main(String[] args)
	{
		meth1();
		System.out.println("====================");
		meth2();
		System.out.println("====================");
		meth3();
	}
	static void meth1()
	{
		String str = "KalaDHAr iS a GooD BoY";
	     StringBuilder sb = new StringBuilder();
	     for(int i=0;i<str.length();i++)
	     {
	    	 if(Character.isUpperCase(str.charAt(i)))
	    	 {
	    		 sb.append(Character.toLowerCase(str.charAt(i)));
	    	 }
	    	 else {

	    		 sb.append(Character.toUpperCase(str.charAt(i)));
	    	 }
	     }
	     System.out.println(sb);
	}
	static void meth2()
	{
		String str = "KalaDHAr iS a GooD BoY";
		String s="";
		for(int i=0;i<str.length();i++)
		{
			
			if(Character.isUpperCase(str.charAt(i)))
			{
				s=s+Character.toLowerCase(str.charAt(i));
						
			}
			else {
				s=s+Character.toUpperCase(str.charAt(i));
			}
		}
		System.out.println(s);
	}
	static void meth3()
	{
		String str = "KalaDHAr iS a GooD BoY";
		String s="";
		for(int i=0;i<str.length();i++)
		{
			
			if(str.charAt(i)>='A' && str.charAt(i)<='Z')
			{
				int s1=(int)str.charAt(i)+32;
				s=s+(char)s1;
						
			}
			else if(str.charAt(i)>='a' && str.charAt(i)<='z'){
				int s1=(int)str.charAt(i)-32;
				s=s+(char)s1;
			}
			else {
				s=s+' ';
			}
		}
		System.out.println(s);
		
	}
}
