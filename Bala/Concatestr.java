import java.applet.*;
import java.awt.*;

public class Concatestr extends Applet
{
	TextField ts1,ts2;
	public void init()
	{
		ts1=new TextField(10);
		ts2=new TextField(10);
		ts1.setText(" ");
		ts1.setText(" ");
		add (ts1);
		add (ts2);
	}

public void paint(Graphics g)
{
    g.drawString("Enter two strings: ", 10, 80);
    
	String str1,str2;
	str1=ts1.getText();
	str2=ts2.getText();
	
	g.setColor(Color.red);
	g.drawString((str1.concat(" ")).concat(str2), 10, 100);
	
}

public boolean action(Event e,Object o)
{
	repaint();
	return true;
}
}
