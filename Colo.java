import java.awt.*;
import java.applet.*;

public class Colo extends Applet
{
Font f1,f2,f3;
	public void init()
	{
	   f1 = new Font("Arial", Font.BOLD, 18);
	   f2 = new Font("Forte", Font.PLAIN, 24);
	   f3 = new Font("Elephant", Font.ITALIC, 28);
	}
	public void paint(Graphics g)
	{
	setBackground(Color.yellow);
	
	g.setColor(Color.red);
	g.drawString("Snehal", 50, 50);
	
	g.setColor(Color.blue);
	g.setFont(f1);
	g.drawString("Minal", 50, 80);

	g.setColor(Color.green);
	g.setFont(f2);
	g.drawString("Riya", 50, 110);

	g.setColor(Color.magenta);
	g.setFont(f3);
	g.drawString("Sanil", 50, 140);
}
}