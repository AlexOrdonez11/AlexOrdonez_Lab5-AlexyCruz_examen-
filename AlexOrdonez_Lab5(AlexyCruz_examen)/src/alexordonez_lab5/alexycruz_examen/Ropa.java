
package alexordonez_lab5.alexycruz_examen;

import java.awt.Color;

/**
 *
 * @author Alex Ordonez
 */
public class Ropa extends Objeto{
    private int talla;
    private String material,p_elabora;

    public Ropa() {
    }

    public Ropa(int talla, String material, String p_elabora, Color c, String descrip, String marca, int tamano, int calidad, Persona dueno) {
        super(c, descrip, marca, tamano, calidad, dueno);
        this.talla = talla;
        this.material = material;
        this.p_elabora = p_elabora;
    }

    public int getTalla() {
        return talla;
    }
    public void setTalla(int talla) {
        this.talla = talla;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getP_elabora() {
        return p_elabora;
    }

    public void setP_elabora(String p_elabora) {
        this.p_elabora = p_elabora;
    }

    @Override
    public String toString() {
        return "Ropa{" + "talla=" + talla + ", material=" + material + ", p_elabora=" + p_elabora + '}';
    }
    
}
