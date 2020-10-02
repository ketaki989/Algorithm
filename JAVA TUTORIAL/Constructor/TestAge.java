class GrandFather
{	
	int gage;
	public GrandFather(int gage)
	{
	this.gage=gage;
	}
	public void ShowAge()
	{
	System.out.println("GrandFather Age:"+gage);
	}
}
class Father extends GrandFather
{
	int fage;
	public Father(int fage)
	{
	super(fage+30);
	this.fage=fage;
	}
	public void ShowAge()
	{
	super.ShowAge();
	System.out.println("Father Age:"+fage);
	}
}
class Daughter extends Father
{
	int dage;
	public Daughter(int dage)
	{
	super(dage+30);
	this.dage=dage;
	}
	public void ShowAge()
	{
	super.ShowAge();
	System.out.println("Daughter Age:"+dage);
	}
}
class TestAge
{
	public static void main(String args[])
	{
	Daughter d=new Daughter(20);
	d.ShowAge();
	}
}