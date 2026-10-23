import java.awt.*;
import java.applet.Applet;
import java.util.*;
/*<applet code="MyApplet" width="300" height="220"></applet> */
public class MyApplet extends Applet implements Runnable
{
    Thread t ,t2;
    public void start()
    {
        t=new Thread(this);
        t.start();
    }
    public void run()
    {
        Thread t1=Thread.currentThread();
        while(t1==t)
        {
            repaint();
            try
            {
               Thread.sleep(1000);
            }

            catch(InterruptedException e){}
        }
    }

    public void paint(Graphics g){
        Calendar cal= new GregorianCalendar();
        String hour=String.valueOf(cal.get(Calendar.HOUR_OF_DAY));
        String minute= String.valueOf(cal.get(Calendar.MINUTE));
        String second=String.valueOf(cal.get(Calendar.SECOND));
        g.drawString(hour+":"+ minute+":"+ second ,20 ,30);


    }
}