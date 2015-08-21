/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uelbosque.sistemas.swii.c1.marte.unittest;

import co.edu.uelbosuqe.sistemas.swii.gui.Iniciar;
import co.edu.uelbosuqe.sistemas.swii.gui.PanelMarte;
import co.edu.uelbosque.sistemas.swii.c1.marte.*;
import java.io.FileNotFoundException;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 *
 * @author Scabrera
 */
public class ProbarCrearTablero {

    

    @Test
    public void probarDibujarPlano() throws Exception {

        PanelMarte pm = new PanelMarte(new Tablero(7, 6));
   Tablero a = new Tablero(7, 6);
        Iniciar iniciar = new Iniciar();
    }

    @Test(expectedExceptions = Exception.class)
    public void probarTamanoDeTablero() throws Exception {
        PanelMarte pn = new PanelMarte(new Tablero(-2, -8));

    }

    @Test
    public void probarTamanoDeTableroOK() throws Exception {
       Tablero pm = new Tablero(5, 5);
        Controlador contr = new Controlador();
        Assert.assertEquals(pm, contr.getcontrolarTablero());
    }

}
