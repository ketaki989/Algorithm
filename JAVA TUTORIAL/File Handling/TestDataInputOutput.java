import java.io.*;
class TestDataInputOutput
{
	public static void main(String args[])throws Exception
	{
FileOutputStream fout=new FileOutputStream("E:\\data.txt");
DataOutputStream dout=new DataOutputStream(fout);
dout.writeInt(10);
dout.writeFloat(10.10f);
dout.writeBoolean(true);
System.out.println("Data Copy in to FILE....");
	FileInputStream fin=new FileInputStream("E:\\data.txt");
	DataInputStream din=new DataInputStream(fin);
	int n=din.readInt();
	float f=din.readFloat();
	boolean b=din.readBoolean();
	System.out.println(n+"\n"+f+"\n"+b);
	}
}