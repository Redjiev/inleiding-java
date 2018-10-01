package JavaChallenge;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Staafdiagram extends Applet {
    Button toonknop;
    int Toon;
    int Valeriegewicht;
    int Jeroengewicht;
    int Hansgewicht;

    TextField tekstvak;
    String tekst;


    public void init() {
        tekst = "";
        tekstvak = new TextField("", 20);
        add(tekstvak);
        tekstvak = new TextField("", 20);
        add(tekstvak);
        tekstvak = new TextField("", 20);
        add(tekstvak);

        toonknop = new Button("Toon");
        toonknop.addActionListener( new knopListener());
        add(toonknop);


    }

    public void paint(Graphics g) {
        g.drawLine(50, 120, 165, 120);
        g.drawLine(50, 10, 50, 100);

        setSize(1000, 1000);

        g.drawString("20", 30, 95);
        g.drawString("40", 30, 75);
        g.drawString("60", 30, 55);
        g.drawString("80", 30, 35);
        g.drawString("100", 25, 15);
        g.drawString("Valerie", 285, 50);
        g.drawString("Valerie", 40, 130);
        g.drawString("Hans", 625, 50);
        g.drawString("Hans", 140, 130);
        g.drawString("Jeroen", 450, 50);
        g.drawString("Jeroen", 95, 130);

        g.setColor(Color.red);
        g.fillRect(50, 75, 25, 45);
        g.fillRect(95, 35, 25, 85);
        g.fillRect(140, 55, 25, 65);






            }
    class knopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Valeriegewicht = 30;
            Jeroengewicht = 30;
            Hansgewicht = 30;




        }
    }
}

