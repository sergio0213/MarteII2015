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

    ManejadorArchivo manejador ;
    Robot robot;
    Movimiento mov;

    public Controlador() throws FileNotFoundException, IOException {
      manejador= new ManejadorArchivo();
      manejador.setRutaArchivo("src/main/resources/reglas.txt");
        mov = new Movimiento();
    }

    public Controlador(String ruta) throws FileNotFoundException, IOException {
        manejador.setRutaArchivo(ruta);
        mov = new Movimiento();
    }

    public Robot controlarInstrucciones() throws IOException, Exception {

        if (manejador.getArchivo().get(1).isEmpty()) {
            throw new NullPointerException("Error el archivo no contiene las instrucciones de movimiento");
        }
        robot = manejador.getPosRobot();
        robot = mov.calcularCordanadas(robot.getX(), robot.getY(), robot.getCord(), manejador.getArchivo().get(1));
        return robot;

    }
    
    public Tablero  getcontrolarTablero() throws IOException{    
       
        Tablero t=manejador.getPrimeraLinea();               
        return t;
    
    }
 
}
