import java.io.*;
class TestPrg49
{
	public static void main(String args[])
	{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	char ch1;
	System.out.println("Enter Character '$' to terminate..");
	ch1=(char)br.read();
	while(ch1!='$')
	{
	System.out.println(ch1);
	ch1=(char)br.read();
	}
	}
}