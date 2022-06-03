import java.applet.*;
import java.awt.*;
public class Test1 extends Applet
{
public void paint(Graphics g)
{
g.setColor(Color.yellow);

g.fillOval(80,70,150,150);

g.setColor(Color.red);
g.fillOval(120,120,15,15);
g.fillOval(170,120,15,15);
 g.fillArc(130,150,45,45,180,180);
 
g.drawLine(10,20,10,30);
g.drawString("welcome",10,10);
g.drawRect(10,30,60,40);
 
}
}
/*
<applet code="Test1.java" width=500 height=500>
</applet>
*/
