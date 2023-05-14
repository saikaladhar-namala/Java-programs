import java.io.*;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class bufferedstreamEXp1
{
	void meth1() throws IOException
	{

		System.out.println("Connection Created");
		System.out.println("=====================");
		BufferedWriter abj=new BufferedWriter(new FileWriter("F:\\hub programs\\demomy1.txt",true));
		
		String s="Will u able to meet me";
		abj.write(s);
		
		abj.close();
		
		
	}
	void meth2() throws IOException
	{

		System.out.println("Connection Created");
		System.out.println("=====================");
		BufferedReader abj=new BufferedReader(new FileReader("F:\\hub programs\\demomy1.txt"));
		
		//String s="Will u able to meet me";
		int x;
		while((x=abj.read())!=-1) {
			System.out.print((char)x);
		}
		
	}
	void meth3() throws Exception
	{
		System.out.println("Connection Created");
		System.out.println("=====================");
		BufferedReader abj1=new BufferedReader(new FileReader("F:\\hub programs\\demomy1.txt"));
		BufferedWriter abj2=new BufferedWriter(new FileWriter("F:\\hub programs\\demomy3.txt"));
		
		int val;
		while((val=abj1.read())!=-1)
		{
			abj2.write(val);
		}
		abj1.close();
		abj2.close();
	}
	public static void main(String[] args) throws Exception
	{
		problem2 abj=new problem2();
		abj.meth1();
		abj.meth2();
		abj.meth3();
	}
}

