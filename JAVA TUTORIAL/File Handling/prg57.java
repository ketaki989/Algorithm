import java.io.*;
import java.util.*;
class prg57
{
	public static void main(String args[])
	{
		try
		{
		FileInputStream fin=new FileInputStream("E:\\Fileforjava\\integer.txt");
		DataInputStream din=new DataInputStream(fin);
		int x,Odd=0,Even=0;
		Scanner sc=new Scanner(System.in);
		x=sc.nextInt();
		FileOutputStream fout=new FileOutputStream("E:\\Fileforjava\\integer.txt");
		fout.write(x);
		while(fin.available()>0)
		{
		x=din.readInt();
		System.out.println("x:"+x);
			if(x%2==0)
			{
			Even++;
			}
			else
			{
			Odd++;
			}
		}
		fin.close();
		System.out.println("Odd Numbers:"+Odd);
		System.out.println("Even Numbers:"+Even);
		}
		catch(FileNotFoundException e)
		{
		System.out.println("Exception:"+e);
		}
		catch(Exception e)
		{
		System.out.println("Exception class:"+e);
		}
	}
	
}