class Hello
{
	public Hello()
	{
	System.out.println("IN Hello Class..Says Hello..");	
	}
}
class Welcome
{
	public Welcome()
	{
	System.out.println("In Welcome Class..says Welcome.. ");
	}
}
class TestConstructor
{
Hello h1=new Hello();
Welcome w1=new Welcome();
Welcome w2=new Welcome(w1);
}
