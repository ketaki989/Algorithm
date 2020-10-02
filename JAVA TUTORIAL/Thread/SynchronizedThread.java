class Thread1
{
synchronized void call()
{
	System.out.println("First Statements");
	try
	{
	Thread.sleep(1000);
	}
	catch(Exception e)
	{
	System.out.println("Exception :"+e);
	}
	System.out.println("Second Statements");
}
}
class Thread2 extends Thread
{
	Thread1 t;
	public Thread2(Thread1 t)
	{
	this.t=t;
	}
	public void run()
	{
	t.call();
	}
}
class SynchronizedThread
{
public static void main(String args[])
{
Thread1 obj1=new Thread1();
Thread2 t1=new Thread2(obj1);
Thread2 t2=new Thread2(obj1);
t1.start();
t2.start();
}
}