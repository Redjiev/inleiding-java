package H4;

import java.applet.Applet;
import java.awt.*;

public class H4Praktijk extends Applet {
    public void init() {

    }
    public void paint(Graphics g) {
        setSize(1000,1000);
        g.drawLine(50, 120, 270, 120);
        g.drawRect(20, 20, 100, 50);

        g.setColor(Color.magenta);
        g.fillRect(150,20,100,50);



        g.setColor(Color.black);
        g.drawOval(150, 20, 100, 50);

        g.setColor(Color.magenta);
        g.fillOval(200, 200, 100, 50);

        g.setColor(Color.black);
        g.drawOval(300,50,50,50);

        g.setColor(Color.black);
        g.drawRoundRect(500,20,100,50, 45,20);

        g.drawOval(800,20,100,100);

        g.setColor(Color.magenta);
        g.fillArc(800, 20, 100, 100, 45, 20);






    }
}
