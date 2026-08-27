public class Assam
{
public static void main(String [] args)
{
String s1=new String ("Computer");
String s2=new String ("computer");
int i=s1.compareTo(s2);
if (i==0)
 System.out.println("strings are same");
else if (i>0)
System.out.println("opposite of dictionary");
else
System.out.println("dictionary order");
}
}