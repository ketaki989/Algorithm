import java.io.*;
class TestPrintReader
{
public static void main(String args[])
{
	try
	{
	FileReader fout=new FileReader("E:\\Fileforjava\\print.txt");
	PrintReader pr=new PrintReader(fout);
	
	}
	catch(Exception e)
	{
	System.out.println("Exception :"+e.toString());
	}
}
}