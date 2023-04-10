import java.util.Scanner;

public class Aliennumber
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num=sc.nextInt();
		int square=num*num;
		//System.out.println(square+" The Square");
		int rev=0;
		while(num>0)
		{
			int rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		//System.out.println(rev);
		int revsquare=rev*rev;
		//System.out.println(revsquare+" The Rev square");
		int rev1=0;
		while(revsquare>0)
		{
			int rem1=revsquare%10;
			rev1=rev1*10+rem1;
			revsquare=revsquare/10;
		}
		//System.out.println(rev1+" reverse of square");
		if(square==rev1)
		{
			System.out.println("Alein Number");
		}
		else {
			System.out.println("Not Alein Number");
		}
	}
}
/*F:\hub programs>java Alien
Enter the Number:
12   12*12=144  revrsed of 12 is 21 and square is 441 and its reversed is equal to 144
Alein Number
*/