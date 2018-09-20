package H4;

import java.applet.Applet;
import java.awt.*;

public class Opdracht6 extends  Applet {
    public void init() {


    }
    public void paint(Graphics g) {
        g.setColor(Color.green);
        g.fillOval(20, 20, 100, 100);

        g.setColor(Color.orange);
        g.fillOval(20, 130, 100, 100);

        g.setColor(Color.red);
        g.fillOval(20, 240, 100, 100);
        setSize(1000,1000);







    }
}
