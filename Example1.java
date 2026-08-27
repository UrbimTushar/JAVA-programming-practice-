class A
{
public A()
{
 System.out.println("urbim");
}
}
class B extends A
{
	public B()
{
	super();
System.out.println("alok" );
}
}
public class Example 
{
public static void main( String [] args)
{
B x1= new B();
}
}
