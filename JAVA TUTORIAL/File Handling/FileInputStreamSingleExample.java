import java.io.FileInputStream;
class FileInputStreamSingleExample
{
public static void main(String args[])
{	
	try
	{
	FileInputStream fin=new FileInputStream("E:\data2.txt");
	int i=fin.read();
	System.out.println((char)i);
	}
	catch(Exception e)
	{
	System.out.println("Exception :"+e);
	}
}
}