package H8;

import java.applet.Applet;
import java.awt.*;

public class Opdracht1 extends Applet {
    TextField tekstvak;
    Button knop;
    public void init() {
        tekstvak = new TextField("", 30);
        knop = new Button();
        knop.setLabel( "Ok" );
        add(tekstvak);


        add(knop);
        knop = new Button();
        knop.setLabel( "Reset");
        add(knop);

    }
    public void paint(Graphics g) {
        g.drawString("", 50, 60 );

    }
        }
















