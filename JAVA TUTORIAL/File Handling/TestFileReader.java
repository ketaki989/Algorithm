import java.io.*;
class TestFileReader
{
	public static void main(String args[])
	{
	try
	{
	File file=new File("Name.txt");
	FileReader f=new FileReader(file);
	int ch;
	System.out.println("Character Class FileReader:");
	while((ch=f.read())!=-1)
	{
		System.out.print((char)ch);
	}
	}
	catch(FileNotFoundException e)
	{
	System.out.println("Exception : "+e);
	}
	catch(IOException e)
	{
	System.out.println("Exception : "+e);
	}
	}//end  of MAin();
}
