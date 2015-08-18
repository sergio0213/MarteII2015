/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uelbosque.sistemas.swii.c1.marte;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Alejandro
 */
public class ManejadorArchivo {

    public File reglas;
    FileReader fr;
    BufferedReader br;
    private ArrayList<String> archivo;

    public ManejadorArchivo() {
        archivo = new ArrayList<>();
    }

    public void setRutaArchivo(String ruta) throws FileNotFoundException {
        reglas = new File(ruta);
        if ((!reglas.exists())) {
            throw new FileNotFoundException("El Archivo de Reglas No Existe");
        }

        this.fr = new FileReader(reglas);
        this.br = new BufferedReader(fr);

    }

    public Tablero getPrimeraLinea() throws IOException {
        Tablero t = new Tablero();
        String[] xy;
        xy = br.readLine().split(" ");

        t.setX(Integer.parseInt(xy[0]));
        t.setY(Integer.parseInt(xy[1]));

        return t;

    }

    private ArrayList<String> getInstrucciones() throws IOException {
        String lee;
        while ((lee = br.readLine()) != null) {
            archivo.add(br.readLine());
        }
        fr.close();
        return archivo;

    }

    public ArrayList<String> getArchivo() throws Exception {
        if (archivo.isEmpty()) {
                throw new Exception("El archivo esta Vacio");
            }
        
        return archivo;
    }

    public void setArchivo(ArrayList<String> archivo) {
        this.archivo = archivo;
    }

    public Robot getPosRobot() throws IOException {
        if (this.archivo.isEmpty()) {
            getInstrucciones();
        }
        String lineaRobot = this.archivo.get(0);
        String parts[] = lineaRobot.split(" ");
        int x = Integer.parseInt(parts[0]);
        int y = Integer.parseInt(parts[1]);
        String orientacion = parts[2];

        return new Robot(x, y, orientacion);
    }

}
