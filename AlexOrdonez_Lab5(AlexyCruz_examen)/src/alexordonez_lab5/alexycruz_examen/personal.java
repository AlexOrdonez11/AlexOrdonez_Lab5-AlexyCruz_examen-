/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alexordonez_lab5.alexycruz_examen;

import java.util.Date;

/**
 *
 * @author Alex Ordonez
 */
public class personal extends Persona{
    private String ocupacion,horario;
    private Date tiempotrab;
    private double sueldo;
    public personal() {
        super();
    }

    public personal(String ocupacion, String horario, Date tiempotrab, double sueldo, String nombre, String sexo, String Estado_c, int ID) {
        super(nombre, sexo, Estado_c, ID);
        this.ocupacion = ocupacion;
        this.horario = horario;
        this.tiempotrab = tiempotrab;
        this.sueldo = sueldo;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Date getTiempotrab() {
        return tiempotrab;
    }

    public void setTiempotrab(Date tiempotrab) {
        this.tiempotrab = tiempotrab;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "personal{" + "ocupacion=" + ocupacion + ", horario=" + horario + ", tiempotrab=" + tiempotrab + ", sueldo=" + sueldo + '}';
    }
    
    
}
