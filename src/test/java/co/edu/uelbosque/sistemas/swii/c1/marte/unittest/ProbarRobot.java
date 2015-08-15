/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uelbosque.sistemas.swii.c1.marte.unittest;

import co.edu.uelbosque.sistemas.swii.c1.marte.ManejadorArchivo;
import co.edu.uelbosque.sistemas.swii.c1.marte.Robot;
import java.io.IOException;
import org.testng.annotations.Test;

/**
 *
 * @author Scabrera
 */
public class ProbarRobot {

    @Test
    public void probarPosicionInicialRobot() {
//        Robot robot = new Robot();
//        ManejadorArchivo ma = new ManejadorArchivo();
//      
//        robot.setX(1);
//        robot.setX(2);
//        robot.setCord("N");
//        robot.getX();
//        robot.getY();
//        robot.getCord();

    }

    @Test
    public void probarAsignarPosicion() throws IOException {
//        Robot robot = new Robot();
//        ManejadorArchivo ma = new ManejadorArchivo();
//          ma.setRutaArchivo("src/main/resources/reglas.txt");
//        String[]xyc;
//        xyc =  ma.getInstrucciones().get(0).split(" ");
//       
//        robot.setX(Integer.parseInt(xyc[0]));
//        robot.setY(Integer.parseInt(xyc[1]));
//        robot.setCord(xyc[2]);
//           System.out.println("x="+ robot.getX() + " Y="+ robot.getY()+" Or"+ robot.getCord());
//       
//        robot.getCord();

    }

    @Test(expectedExceptions = NumberFormatException.class)
    public void probarPosicionInvalida() {

        Robot robot = new Robot();

        robot.setX(-1);
        robot.setY(-2);
        robot.setCord("X");
        System.out.println("x=" + robot.getX() + " Y=" + robot.getY() + " Or" + robot.getCord());

        robot.getCord();

    }

}
