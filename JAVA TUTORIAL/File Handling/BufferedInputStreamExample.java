//Class BufferedInputStream extends FilterInputStream class;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
class BufferedInputStreamExample
{
public static void main(String args[])
{	
	try
	{
	FileInputStream fin=new FileInputStream("C:\\Tuition Java\\File Handling\\BufferedOutputStreamExample.java");
	BufferedInputStream bis=new BufferedInputStream(fin);
	int i;
	while((i=bis.read())!=-1)
	{
	System.out.print((char)i);
	}
	bis.close();
	fin.close();
	}
	catch(Exception e)
	{
	System.out.println("Exception :"+e);
	}
}
} 