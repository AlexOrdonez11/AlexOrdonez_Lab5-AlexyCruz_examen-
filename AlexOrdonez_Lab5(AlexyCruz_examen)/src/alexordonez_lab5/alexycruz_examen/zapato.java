/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alexordonez_lab5.alexycruz_examen;

import java.awt.Color;

/**
 *
 * @author Alex Ordonez
 */
public class zapato extends Objeto {
    private int talla,confort;
    private String suela;    

    public zapato() {
    }

    public zapato(int talla, int confort, String suela, Color c, String descrip, String marca, int tamano, int calidad, Persona dueno) {
        super(c, descrip, marca, tamano, calidad, dueno);
        this.talla = talla;
        this.confort = confort;
        this.suela = suela;
    }

    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }

    public int getConfort() {
        return confort;
    }

    public void setConfort(int confort) {
        this.confort = confort;
    }

    public String getSuela() {
        return suela;
    }

    public void setSuela(String suela) {
        this.suela = suela;
    }

    @Override
    public String toString() {
        return "zapato{" + "talla=" + talla + ", confort=" + confort + ", suela=" + suela + '}';
    }
    
}
