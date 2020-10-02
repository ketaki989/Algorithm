import java.io.*;
class TestFileWriter
{
	public static void main(String args[])
	{
		try
		{
		String str="Welcome ...Ganapati into Stream Classes in java..";
		FileWriter fout=new FileWriter("Stream.txt");
		fout.write(str,0,str.length());
		fout.close();	
		}
		catch(Exception e)
		{
		System.out.println("Exception : "+e);
		}
	}
}