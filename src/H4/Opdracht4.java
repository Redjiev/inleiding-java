package H4;

import java.applet.Applet;
import java.awt.*;

public class Opdracht4 extends  Applet {

    public void init() {

    }
    public void paint(Graphics g) {
        g.drawLine(50, 120, 270, 120);
        g.drawString("40", 30, 95 );
        g.drawString("80", 30, 75 );
        g.drawRect(50,95,25,25);
        g.drawRect(95,70,25,50);
        g.drawRect(140,45,25,75);
        g.drawString("100", 30, 45 );
        g.drawString("", 50, 60 );
        g.drawString("Valerie",40,130);
        g.drawString("Hans",95,130);
        g.drawString("Jeroen",140,130);







    }
}
