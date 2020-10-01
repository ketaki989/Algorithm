import java.io.FileOutputStream;
import java.io.FileInputStream;class FileOutputStreamExample
{
	public static void main(String args[])
	{
	try
	{
	FileOutputStream fout=new FileOutputStream("E:\\Data1.txt");
	int ch=122;
	fout.write((char)ch); 
	System.out.println("Successfully Written in File Data1.txt in E drive..");
	fout.close();
	}
	catch(Exception e)
	{
	System.out.println("Exception :"+e);
	}
	}
}