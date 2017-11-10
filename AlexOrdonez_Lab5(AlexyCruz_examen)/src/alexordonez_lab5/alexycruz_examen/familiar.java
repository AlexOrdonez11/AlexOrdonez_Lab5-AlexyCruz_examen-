/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alexordonez_lab5.alexycruz_examen;

import java.util.ArrayList;

/**
 *
 * @author Alex Ordonez
 */
public class familiar extends Persona{
    private String trabajo;
    private int peso,altura,rol;
    private ArrayList objetos=new ArrayList();

    public familiar() {
        super();
    }

    public familiar(int rol, String trabajo, int peso, int altura, String nombre, String sexo, String Estado_c, int ID) {
        super(nombre, sexo, Estado_c, ID);
        this.rol = rol;
        this.trabajo = trabajo;
        this.peso = peso;
        this.altura = altura;
    }

    public int getRol() {
        return rol;
    }

    public void setRol(int rol) {
        this.rol = rol;
    }

    public String getTrabajo() {
        return trabajo;
    }

    public void setTrabajo(String trabajo) {
        this.trabajo = trabajo;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public ArrayList getObjetos() {
        return objetos;
    }

    public void setObjetos(ArrayList objetos) {
        this.objetos = objetos;
    }

    @Override
    public String toString() {
        return "familiar{" + "rol=" + rol + ", trabajo=" + trabajo + ", peso=" + peso + ", altura=" + altura + ", objetos=" + objetos + '}';
    }
    
}
