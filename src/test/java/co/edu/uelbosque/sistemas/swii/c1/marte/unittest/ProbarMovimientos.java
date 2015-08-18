package co.edu.uelbosque.sistemas.swii.c1.marte.unittest;


import co.edu.uelbosque.sistemas.swii.c1.marte.Controlador;
import co.edu.uelbosque.sistemas.swii.c1.marte.Movimiento;
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
   public void probarMovimientosIniciales() throws Exception{
    Movimiento mo = new Movimiento();
    
    mo.calcularCordanadas(1, 2,"N","IAIAIAIAA");
   
   }
   
   @Test (expectedExceptions = Exception.class)
   public void instrucionesMalas() throws Exception{
    Movimiento mo = new Movimiento();
    mo.calcularCordanadas(1, 2, "N", "IAXYAA");
   
   }
   
    @Test
   public void probarMovimientosRobot() throws Exception{
        Controlador c = new Controlador();
   c.controlarInstrucciones();
   }
    
}
