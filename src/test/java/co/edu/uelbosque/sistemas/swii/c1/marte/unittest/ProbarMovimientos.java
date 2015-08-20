package co.edu.uelbosque.sistemas.swii.c1.marte.unittest;

import co.edu.uelbosque.sistemas.swii.c1.marte.Controlador;
import co.edu.uelbosque.sistemas.swii.c1.marte.ManejadorArchivo;
import co.edu.uelbosque.sistemas.swii.c1.marte.Movimiento;
import co.edu.uelbosque.sistemas.swii.c1.marte.Robot;
import org.testng.Assert;
import org.testng.annotations.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author clave-e205
 */
public class ProbarMovimientos {

    @Test
    public void probarMovimientosIniciales() throws Exception {
        Movimiento mo = new Movimiento();

        mo.calcularCordanadas(1, 2, "N", "IAIAIAIAA");

    }

    @Test(expectedExceptions = Exception.class)
    public void instrucionesMalas() throws Exception {
        Movimiento mo = new Movimiento();
        mo.calcularCordanadas(1, 2, "N", "IAXYAA");

    }

    @Test(expectedExceptions = NullPointerException.class)
    public void archivoSininstruccionesDeMovimiento() throws Exception {
        Controlador c = new Controlador("src/main/resources/malo.txt");
        c.controlarInstrucciones();

    }

    @Test
    public void probarMovimientosRobot() throws Exception {
        Robot esperado = new Robot(1, 3, "N");
        ManejadorArchivo manejador = new ManejadorArchivo();
        manejador.setRutaArchivo("src/main/resources/reglas.txt");
        Movimiento mov = new Movimiento();
        Controlador c = new Controlador();

        c.controlarInstrucciones();
        Robot prueba = manejador.getPosRobot();
        prueba = mov.calcularCordanadas(prueba.getX(), prueba.getY(), prueba.getCord(), manejador.getArchivo().get(1));
        Assert.assertEquals(esperado, prueba);

    }

}
