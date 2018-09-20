package H6;

import java.applet.Applet;
import java.awt.*;

public class Opdracht1 extends Applet {
    int a, b, c;
    double uitkomst;




    public void init() {
        a = 8;
        b = 8;
        c = 3;
        uitkomst = (a + b + c) / 3;


    }
    public void paint (Graphics g) {
        g.drawString("De uitkomst is: " + uitkomst, 20, 20);

    }
}
