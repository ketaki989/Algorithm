class Demo
{
	synchronized void call(String str)
	{	
		System.out.println("In Demo.."+str);
		System.out.println("First Statment");
		try
		{
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			System.out.println("Exception :"+e);
		}
		System.out.println("Second Statement...");
	}
}
class Thread1 extends Thread
{	Demo obj;
	String str;
	public Thread1(Demo obj,String str)
	{
		this.obj=obj;
		this.str=str;
	}
	public void run()
	{
		obj.call(str);
	}
}
class TestThread
{
	public static void main(String args[])
	{
		Demo obj=new Demo();
		Thread1 d1=new Thread1(obj,"Java");
		Thread1 d2=new Thread1(obj,"Oracle");
		d1.start();
		d2.start();
	}
}