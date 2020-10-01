import java.io.*;
class Practice1InputOutput
{
public static void main(String args[])throws Exception
{
//--------------Writing Data to File DATA1 in E drive---------
FileOutputStream fout=new FileOutputStream("E:\\Data1.txt");
DataOutputStream dout=new DataOutputStream(fout);
dout.writeInt(10);
dout.writeFloat(10.10f);
dout.writeBoolean(false);
dout.writeDouble(101.10);
dout.writeByte(0);
System.out.println("Data Writen to File Data1");
//------------------Reading Data From File---------------
FileInputStream fin=new FileInputStream("E:\\Data1.txt");
DataInputStream din=new DataInputStream(fin);
int ch=din.readInt();
float f=din.readFloat();
boolean b=din.readBoolean();
double D=din.readDouble();
byte B=din.readByte();
System.out.println("Int:"+ch+"\nFloat:"+f+"\nBoolean:"+b+"\nDouble:"+D+"\nByte:"+B);
}
}