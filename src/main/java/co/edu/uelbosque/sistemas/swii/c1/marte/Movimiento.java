/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uelbosque.sistemas.swii.c1.marte;

/**
 *
 * @author scabrera
 */
public class Movimiento {

    public Robot calcularCordanadas(int ix, int iy, String io, String orden) throws Exception {

        for (int i = 0; i < orden.length(); i++) {
            System.out.println(""+orden.substring(i, i + 1));
            switch (orden.substring(i, i + 1)) {
                case "O":

                    break;
                case "E":

                    break;
                case "S":

                    break;
                case "N":

                    break;
                case "I":

                    break;
                case "D":

                    break;
                     default:
                         throw new Exception("Error Instruccion no valida");
                       

            }
        }

        return null;
    }

}
