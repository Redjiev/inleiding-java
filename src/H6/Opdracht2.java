package H6;

import java.applet.Applet;
import java.awt.*;

public class Opdracht2 extends Applet {

    int uur, dag, jaar;
    double uitkomst;



    public void init() {
        uur = 3600;
        dag = 3600 * 24;
        jaar = 31556926;
        uitkomst = 3600;
    }
    public void paint (Graphics g) {
        g.drawString("Aantal seconden in een uur: " + uur, 20, 20);
        g.drawString("Aantal seconden in een dag: " + dag, 20, 40);
        g.drawString("Aantal seconden in een jaar: " + jaar, 20, 60);

    }

}
