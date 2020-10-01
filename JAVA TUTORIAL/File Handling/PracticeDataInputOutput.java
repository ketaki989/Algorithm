import java.util.*;
import java.io.*;
class PracticeDataInputOutput
{
public static void main(String args[])throws Exception
{
FileOutputStream fout=new FileOutputStream("E:\\S1.txt");
String str;
Scanner SC=new Scanner(System.in);
str=SC.next();
fout.writeString(str);
System.out.println(str);
}
}