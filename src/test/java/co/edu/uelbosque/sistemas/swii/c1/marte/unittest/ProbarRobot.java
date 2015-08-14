/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uelbosque.sistemas.swii.c1.marte.unittest;

import co.edu.uelbosque.sistemas.swii.c1.marte.ManejadorArchivo;
import co.edu.uelbosque.sistemas.swii.c1.marte.Robot;
import org.testng.annotations.Test;

/**
 *
 * @author Scabrera
 */
public class ProbarRobot {

    @Test
    public void probarPosicionInicialRobot() {
        Robot robot = new Robot();
        ManejadorArchivo ma = new ManejadorArchivo();
         String[] xy;             
       
        robot.setX(1);
        robot.setX(2);
        robot.setCord("N");
        robot.getX();
        robot.getY();
        robot.getCord();

    }

}
