import java.io.*;
public class Example2
{
    public static void main(String [] args) throws IOException
    {
        FileWriter fw= new FileWriter("Crystel.txt" ,true);
        BufferedWriter bf= new BufferedWriter(fw);

                bf.write("computer");
                        bf.close();
    }
}
