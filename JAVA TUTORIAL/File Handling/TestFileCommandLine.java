import java.io.*;
class TestFileCommandLine
{
	public static void main(String args[])throws Exception
	{
		if(args.length==1)
		{
			try
			{
			FileInputStream fin=new FileInputStream(args[0]);
			int ch=fin.read();
			while(ch!=-1)
			{
				System.out.println((char)ch);	
				ch=fin.read();
			}
			fin.close();
			}
			catch(Exception e)
			{
			System.out.println("Exception:"+e);
			}
		}
	}
}