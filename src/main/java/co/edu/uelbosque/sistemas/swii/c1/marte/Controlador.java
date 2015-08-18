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
    Movimiento mov;
    public Controlador() throws FileNotFoundException, IOException {
        manejador.setRutaArchivo("src/main/resources/reglas.txt");
      
        mov = new Movimiento();
    }

    public void controlarInstrucciones() throws IOException, Exception {

      robot = manejador.getPosRobot();
      robot=  mov.calcularCordanadas(robot.getX(), robot.getY(), robot.getCord(), manejador.getArchivo().get(1));

    }

}
