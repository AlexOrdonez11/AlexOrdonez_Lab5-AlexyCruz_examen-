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
public class Persona {
    private String nombre,sexo,Estado_c;
    private int ID;
    private ArrayList<String>mensajes=new ArrayList();

    public Persona() {
    }

    public Persona(String nombre, String sexo, String Estado_c, int ID) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.Estado_c = Estado_c;
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEstado_c() {
        return Estado_c;
    }

    public void setEstado_c(String Estado_c) {
        this.Estado_c = Estado_c;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public ArrayList<String> getMensajes() {
        return mensajes;
    }

    public void setMensajes(ArrayList<String> mensajes) {
        this.mensajes = mensajes;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", sexo=" + sexo + ", Estado_c=" + Estado_c + ", ID=" + ID + ", mensajes=" + mensajes + '}';
    }
    
}
