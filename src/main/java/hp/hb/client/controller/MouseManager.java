package hp.hb.client.controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseManager implements MouseListener {

    //musimy je zaimplementowac (interface) ale nie sa niezbedne
    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
    //wylapywanie klikniecia --> przesylanie do servera




    // wylapywanie klikniecia
    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("click");
        System.out.println(e.getX() + " " + e.getY());
    }
    // rozpoznac co zostalo klikniete (jakie koordynaty i z jakim obiektem pokrywaja sie)

    // zdecydowac co ma sie stac
    // zakomunikowac serverowi
    // przedstawic rezultat

}
