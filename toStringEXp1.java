//Internal Implementation of toString() working 
//toString() is Present in Object class and also present in String Class ,so it is Overriding and printing
public class toStringEXp1
{
	String name;int num;
	
	toStringEXp1()
	{
		name="kaladhar";
		num=31;
	}
	public String toString()
	{
		return name+" "+num;
	}
	public static void main(String[] args)
	{
		toStringEXp1 abj=new toStringEXp1();
		System.out.println(abj);
		
	}
}

