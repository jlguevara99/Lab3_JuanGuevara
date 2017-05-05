/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_juanguevarap2;

/**
 *
 * @author HP
 */
public class Portero extends Jugador {
    public int aereo;
    public int pies;

    public Portero() {
        super();
    }

    public Portero(int aereo, int pies, String nombre, String apellido, int edad, int estado, String pais, String pie, int numero, double precio, String equipo) {
        super(nombre, apellido, edad, estado, pais, pie, numero, precio, equipo);
        this.aereo = aereo;
        this.pies = pies;
    }

    public int getAereo() {
        return aereo;
    }

    public void setAereo(int aereo) {
        this.aereo = aereo;
    }

    public int getPies() {
        return pies;
    }

    public void setPies(int pies) {
        this.pies = pies;
    }

    @Override
    public String toString() {
        return super.toString() + "\nPortero{" + "aereo=" + aereo + ", \npies=" + pies + '}';
    }
    
}
