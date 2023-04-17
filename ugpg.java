import java.util.Scanner;

public class UG
{
	void btech()
	{
		System.out.println("Btech Course");
		System.out.println("fee: 120000/rs");
		System.out.println("Location: Hyderabad");
	}
	void bsc()
	{
		System.out.println("Bsc Course");
		System.out.println("fee: 190000/rs");
		System.out.println("Location: Banglore");
	}
	

	public static void main(String[] args)
	{
	
		UG ug1=new UG();
		PG pg1=new PG();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the which class u want UG/PG");
		String class_name=sc.next();
		if(class_name.equals("UG"))
		{
			System.out.println("Enter the course BTECH/MTECH");
			String course1=sc.next();
			if(course1.equals("BTECH"))
			{
				ug1.btech();
			}
			else if(course1.equals("BSC"))
			{
				ug1.bsc();
			}
		}
		else if(class_name.equals("PG"))
		{
			System.out.println("Enter the course BTECH/MTECH");
			String course2=sc.next();
			if(course2.equals("MCA"))
			{
				pg1.mca();
			}
			else if(course2.equals("MTECH"))
			{
				pg1.mtech();
			}
		}
		
	}
	
}


class PG
{
	void mca()
	{
		System.out.println("MCA Course");
		System.out.println("fee: 1200/rs");
		System.out.println("Location: Chennnai");
	}
	void mtech()
	{
		System.out.println("Mtech Course");
		System.out.println("fee: 1900/rs");
		System.out.println("Location: Kerala");
	}
	
}