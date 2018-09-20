package H6;

import java.applet.Applet;
import java.awt.*;

public class Opdracht3 extends Applet {
    int a, b;
    double uitkomst;




    public void init() {
        a = 238347457;
        b = 2;
        uitkomst = a + b;
    }
    public  void paint (Graphics g) {
        g.drawString("Negatief getal: " +uitkomst , 20, 20);
    }
}

