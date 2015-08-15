/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uelbosque.sistemas.swii.c1.marte;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author scabrera
 */
public class Controlador {

    ManejadorArchivo manejador = new ManejadorArchivo();
    Robot robot;

    public Controlador() throws FileNotFoundException, IOException {
        manejador.setRutaArchivo("src/main/resources/reglas.txt");
        robot = manejador.getPosRobot();
    }

    public void controlarInstrucciones() throws IOException {

//       manejador.getArchivo().get(0);
//       Robot robot = new Robot();
//       String[]xyc;
//       xyc =  manejador.getInstrucciones().get(0).split(" ");
//        robot.setX(Integer.parseInt(xyc[0]));
//        robot.setY(Integer.parseInt(xyc[1]));
//        robot.setCord(xyc[2]);
    }

}
