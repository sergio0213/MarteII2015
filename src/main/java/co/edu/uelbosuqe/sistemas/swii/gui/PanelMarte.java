/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uelbosuqe.sistemas.swii.gui;

import co.edu.uelbosque.sistemas.swii.c1.marte.Tablero;
import co.edu.uelbosque.sistemas.swii.c1.marte.Tablero;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 *
 * @author Scabrera
 */
public class PanelMarte extends JComponent {

    private final JFrame jf = new JFrame("Marte");
    private Tablero tablero = new Tablero();

    public PanelMarte() {
    }

    public PanelMarte(Tablero tablero) throws Exception {
        if (tablero.getX()<=0 || tablero.getY()<=0) {
                throw new  Exception("Numero no valido");
            }
        this.tablero = tablero;
    }

    @Override
    public void paintComponent(Graphics g) {
        System.out.print(tablero.getX()+"+"+tablero.getY());
        g.drawLine(1, tablero.getY() * 50 , tablero.getX() * 50+30, tablero.getY() * 50);

        g.drawLine(20, tablero.getY() * 50, 20, 1);
        g.setColor(Color.red);
        
        int lin = 20;
        for (int xcont = 0; xcont < tablero.getX(); xcont++) {
            lin += 50;
            g.drawLine(lin, tablero.getY() * 50 , lin, tablero.getY() * 50-5);
        }
        lin = 0;
        for (int ycont = 0; ycont < tablero.getY(); ycont++) {
            lin += 50;
            
            g.drawLine(20,tablero.getX() * 50-50 - lin, 25, tablero.getX() * 50 -50- lin);
        }

    }

  public  void montarTablero(Tablero t) throws Exception {

        PanelMarte p = new PanelMarte(t);
        jf.setDefaultCloseOperation(EXIT_ON_CLOSE);

        jf.getContentPane().setLayout(new BorderLayout());
        jf.getContentPane().add(p, BorderLayout.CENTER);
        jf.setVisible(true);
        jf.setSize(t.getX() * 50+50, t.getY() * 50+50);

    }

}
