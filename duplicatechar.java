import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class duplicatechar
{
   public static void main(String[] args)
   {
	   StringBuffer sb=new StringBuffer("all is well that ends with well");
	   String s="";
	   for(int i=0;i<sb.length();i++)
	   {
		   char c=sb.charAt(i);
		   if(s.indexOf(c)==-1)
		   {
			   s=s+sb.charAt(i);
		   }
		   
	   }
	   System.out.println(s);
	   System.out.println("=============");
	   meth1();
   }
   static void meth1() {
	   
	   
	   String sb="all is well that ends with well   csk csk rcb rcb ";
	   String[] sb1=sb.split("\\s+");
	   LinkedHashSet<String> st=new LinkedHashSet<>();
	   int count=0;
	   for(String val: sb1)
	   {
		   if(!st.add(val))
		   {
			   System.out.println(val);
		   }
		   
	   }
	   
	   
   }
   
}




