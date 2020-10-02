import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
class BufferedOutputStreamExample
{
public static void main(String args[])
{
	try
	{
	FileOutputStream fout=new FileOutputStream("E:\\Fileforjava\\bufferout.txt");
	BufferedOutputStream bos=new BufferedOutputStream(fout);
	String str="Welcome to BufferedOutputStream class in io package...";
	byte b[]=str.getBytes();
	bos.write(b);
	bos.flush();
	bos.close();
	fout.close();
	System.out.println("SUCCESS...");
	}
	catch(Exception e)
	{
	System.out.println("Exception :"+e);
	}
}
} 