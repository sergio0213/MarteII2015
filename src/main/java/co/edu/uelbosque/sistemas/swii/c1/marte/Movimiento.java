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

    public Robot calcularCordanadas(int ix, int iy, String ori, String orden) throws Exception {
        Robot r = new Robot(ix, iy, ori);

        for (int i = 0; i < orden.length(); i++) {
            String letra = orden.substring(i, i + 1);
            System.out.println("" + letra);
            switch (orden.substring(i, i + 1)) {

                case "I":
                    switch (r.getCord()) {
                        case "O":
                            r.setCord("S");
                            break;
                        case "E":
                            r.setCord("N");
                            break;
                        case "S":
                            r.setCord("E");
                            break;
                        case "N":
                            r.setCord("O");
                            break;

                    }
                    break;

                case "D":
                    switch (r.getCord()) {
                        case "O":
                            r.setCord("N");
                            break;
                        case "E":
                            r.setCord("S");
                            break;
                        case "S":
                            r.setCord("O");
                            break;
                        case "N":
                            r.setCord("E");
                            break;

                    }
                    break;

                case "A":
                    switch (r.getCord()) {
                        case "O":
                           r.setX(r.getX()-1);
                            break;
                        case "E":
                          r.setX(r.getX()+1);
                            break;
                        case "S":
                            r.setY(r.getY()-1);
                            break;
                        case "N":
                           r.setY(r.getY()+1);
                            break;

                    }
                    break;

                default:

                    throw new Exception("Error Instruccion no valida");

            }
        }
     
        return r;
    }

}
