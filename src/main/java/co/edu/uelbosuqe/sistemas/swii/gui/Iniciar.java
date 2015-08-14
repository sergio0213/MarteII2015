/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uelbosuqe.sistemas.swii.gui;

import co.edu.uelbosque.sistemas.swii.c1.marte.Tablero;
import java.text.ParseException;


/**
 *
 * @author Scabrera
 */
public class Iniciar {

  public  void creartablero(Tablero t) throws Exception {
      
     PanelMarte panel=   new PanelMarte();
                panel.montarTablero(t);
        
    }
    
    public static void main(String[] args) throws ParseException, Exception {

       PanelMarte panel=   new PanelMarte();
                panel.montarTablero(new Tablero(7,6));

    }
}
