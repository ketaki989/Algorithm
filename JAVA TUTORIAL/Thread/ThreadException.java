class Thread1 extends Thread
{
	public void run()	
	{
	try
	{
		for(int i=0;i<5;i++)
		{
		System.out.println("First Statement");
		sleep(1000);
		}
	}
	catch(Exception e)
	{
	System.out.println("In Thread Class Exception e"+e);
	}
	}
	
}
class ThreadException
{
	public static void main(String args[])
	{
	Thread1 t1=new Thread1();
	t1.start();
	try
	{
		Thread.sleep(2000);
	}
	catch(Exception e)
	{
	//System.out.println("In main Exception:"+e);
		e.printStackTrace();
	}
	t1.interrupt();
	System.out.println("Called Interrupt");
	}
}