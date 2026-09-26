class A extends Thread
{
	public void run()
	{
		int i;
		for (i=10; i<100; i++)
			System.out.println("i="+i+"Thread A");
	}
	
}
class B extends Thread
{
	public void  run()
	{
		int i;
		for (i=10;i<100; i++)
			System.out.println("i= "+i+"Thread A");
	}
}
public class ThreadExample

{
	public static void main(String [] args)
	{
		A o1= new A();
		B o2= new B();
		o1.start();
		o2.start();
	}
}