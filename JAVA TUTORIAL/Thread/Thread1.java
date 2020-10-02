class ThreadEx extends Thread
{	
	String str;
	public ThreadEx(String str)
	{
		this.str=str;
	}
	public void run()
	{
		display();
	}
	public void display()
	{	
		try
		{
			Thread.sleep(2000);
			System.out.println("Hello "+str);
		}
		catch(Exception e)
		{
			System.out.println("Excepton :"+e);
		}
	}
}
class Thread1
{
	public static void main(String args[])
	{
		ThreadEx t1=new ThreadEx("Java");
		ThreadEx t2=new ThreadEx("Python");
		t1.setPriority(1);
		t2.setPriority(7);
		t1.start();
		t2.start();
	}
}