//Serialization
import java.io.*;
class Employee implements Serialization
{
	int eid;
	String ename;
	float esal;
	public Employee(int eid,String ename,float esal)
	{
	this.eid=eid;
	this.ename=ename;
	this.esal=esal;
	}
	public void display()
	{
	System.out.println("Eid   :"+eid);
	System.out.println("Ename :"+ename);
	System.out.println("Esal  :"+esal);
	}
}
class TestSerialization
{
	public static void main(String args[])
	{
		try
		{
//---------------------Writing Object to File---------------------------;
		Employee e1=new Employee(1526256,"Tejashree",1000000000);
		FileOutputStream fout=new FileOutputStream("E:\\Emp.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fout);
		oos.writeObject(e1);
		System.out.println("Object Saved In File...");
//--------------------Reading Object from file---------------------------;
		FileInputStream fin=new FileInputStream("E:\\Emp.txt");
		ObjectInputStream ois=new ObjectInputStream(fin);
		Employee e=(Employee)ois.readObject(e1);
		e.display();
		System.out.println("Displayed On console....");		
		}
		catch(Exception e)
		{
		System.out.println("Exception : "+e);
		}
		
	}
}

