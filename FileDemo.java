import java.io.File;
import java.io.IOException;

class FileDemo
{
	public static void main( String [] args)throws IOException
	{
		
File f1= new File("C:/java folders/ pie.text");
f1.createNewFile();
		
 System.out.println("Can File Read"+f1.canRead());
 System.out.println("File Name"+f1.getName());
 System.out.println("Length Of File"+ f1.length());
		
	}
}
 
	
	
	
	
	
	
	
	
	
	
	
	
	







