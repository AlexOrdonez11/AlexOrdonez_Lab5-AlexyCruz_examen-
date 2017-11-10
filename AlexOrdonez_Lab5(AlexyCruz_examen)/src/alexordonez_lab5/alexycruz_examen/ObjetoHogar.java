/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alexordonez_lab5.alexycruz_examen;

import java.awt.Color;
import java.util.Date;

/**
 *
 * @author Alex Ordonez
 */
public class ObjetoHogar extends Objeto{
    private String casa,armado;
    private Date compra;
    private int vida;

    public ObjetoHogar() {
        super();
    }

    public ObjetoHogar(String casa, String armado, Date compra, int vida, Color c, String descrip, String marca, int tamano, int calidad, Persona dueno) {
        super(c, descrip, marca, tamano, calidad, dueno);
        this.casa = casa;
        this.armado = armado;
        this.compra = compra;
        this.vida = vida;
    }

    public String getCasa() {
        return casa;
    }

    public void setCasa(String casa) {
        this.casa = casa;
    }

    public String getArmado() {
        return armado;
    }

    public void setArmado(String armado) {
        this.armado = armado;
    }

    public Date getCompra() {
        return compra;
    }

    public void setCompra(Date compra) {
        this.compra = compra;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    @Override
    public String toString() {
        return "ObjetoHogar{" + "casa=" + casa + ", armado=" + armado + ", compra=" + compra + ", vida=" + vida + '}';
    }
    
    
}
