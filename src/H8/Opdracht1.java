package H8;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Opdracht1 extends Applet {
    TextField tekstvak;
    Button knop;
    public void init() {
        tekstvak = new TextField("", 30);
        knop = new Button();
        knop.setLabel( "Ok" );
        knop = new Button("Ok");
        KnopListener kl = new KnopListener();
        knop.addActionListener( kl );


        add(tekstvak);


        add(knop);
        knop = new Button();
        knop.setLabel( "Reset");
        add(knop);
        knop = new Button("Reset");




    }
    public void paint(Graphics g) {
        g.drawString("", 50, 60 );


    }
    class KnopListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            Object schermtekst = "Ja, deze knop doet wel iets";
        }
    }
}

















