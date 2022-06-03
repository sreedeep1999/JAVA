import java.applet.*;
import java.awt.*;
class Test extends Applet
{
public void paint(Graphics g)
{
g.drawLine(10,20,10,30);
g.drawString("welcome",10,10);
}
}

/*
<applet code="Test.applet" width=500 height=500>
</applet>
*/
