import java.util.Scanner;
import java.io.FileOutputStream;
class FileOutputStreamExample2
{
	public static void main(String args[])
	{
		try
		{
		FileOutputStream fout=new FileOutputStream("E:\\data2.txt");
		String str="Welcome to java..";
		//System.out.println("Enter your String : ");
		//Scanner sc=new Scanner(System.in);
		//str=sc.next();
		byte b[]=str.getBytes();//converting string into bytes...
		fout.write(b);
		System.out.println("Success..."); 
		
		}
		catch(Exception e)
		{
		System.out.println("Exception :"+e);
		}
	}
}