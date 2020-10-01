import java.io.*;
class TestFileWriter1
{
	public static void main(String args[])
	{
	String str="Welcome Ganapati Bapa to Stream Class of Java.";
	try
	{
	//FileReader fin=new FileReader("E:\\Fileforjava\\Stream.txt");
	FileWriter fout=new FileWriter("E:\\Fileforjava\\Stream.txt");
	fout.write(str,0,str.length());
	fout.close();      
	}
	catch(Exception e)
	{
	System.out.println("Exception : "+e);
	}
	System.out.println("Successfully Written...");
	}
}