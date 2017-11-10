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
public class Objeto {
    private Color c;
    private String descrip,marca;
    private int tamano,calidad;
    private Persona dueno;

    public Objeto() {
    }

    public Objeto(Color c, String descrip, String marca, int tamano, int calidad, Persona dueno) {
        this.c = c;
        this.descrip = descrip;
        this.marca = marca;
        this.tamano = tamano;
        this.calidad = calidad;
        this.dueno = dueno;
    }

    public Color getC() {
        return c;
    }

    public void setC(Color c) {
        this.c = c;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public int getCalidad() {
        return calidad;
    }

    public void setCalidad(int calidad) {
        this.calidad = calidad;
    }

    public Persona getDueno() {
        return dueno;
    }

    public void setDueno(Persona dueno) {
        this.dueno = dueno;
    }
    
}
