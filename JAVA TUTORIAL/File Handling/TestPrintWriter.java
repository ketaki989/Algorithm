import java.io.*;
class TestPrintWriter
{
	public static void main(String args[])
	{
	PrintWriter pw=null;
	try
	{
	FileWriter fin=new FileWriter("E:\\Fileforjava\\print.txt");
	pw=new PrintWriter(fin);
	pw.print("Salvi	    \t:");
	pw.print(157);
	pw.println();
	pw.print("Tejashree \t:");
	pw.print(1526256);
	fin.close();
	}
	catch(Exception e)
	{
	System.out.println("Exception : "+e);
	}
	}
}