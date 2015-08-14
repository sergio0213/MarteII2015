/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uelbosque.sistemas.swii.c1.marte;

/**
 *
 * @author ingeneo
 */
public class Robot {

    private int X;
    private int Y;
    private String cord;

    public int getX() {
        return X;
    }

    public void setX(int X) {
        if (X < 0) {
            throw new NumberFormatException("Cordenada Inicial X invalida");
        }
        this.X = X;
    }

    public int getY() {

        return Y;
    }

    public void setY(int Y) {
        if (Y < 0) {
            throw new NumberFormatException("Cordenada Inicial Y invalida");
        }
        this.Y = Y;
    }

    public String getCord() {

        return cord;
    }

    public void setCord(String cord) {
        if (cord.equals("O") || cord.equals("E") || cord.equals("S") || cord.equals("N")) {
            this.cord = cord;
        } else {
            throw new NumberFormatException("Cordenada Inicial Y invalida");
        }

    }

}
