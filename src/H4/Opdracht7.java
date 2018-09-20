package H4;

import java.applet.Applet;
import java.awt.*;

public class Opdracht7 extends  Applet {
    public void init() {

    }
    public void paint(Graphics g) {
        g.drawRect(20, 20, 100, 100);
        g.drawOval(30, 30, 30, 30);
        g.drawOval(80,30,30,30);
        g.drawOval(30,80,30,30);
        g.drawOval(80,80,30,30);


    }
}

