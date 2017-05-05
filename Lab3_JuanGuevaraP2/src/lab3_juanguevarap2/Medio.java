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
public class Medio extends Jugador {
    public int creatividad;
    public int dominio;
    public double asistencias;

    public Medio() {
        super();
    }

    public Medio(int creatividad, int dominio, double asistencias, String nombre, String apellido, int edad, int estado, String pais, String pie, int numero, double precio, String equipo) {
        super(nombre, apellido, edad, estado, pais, pie, numero, precio, equipo);
        this.creatividad = creatividad;
        this.dominio = dominio;
        this.asistencias = asistencias;
    }

    public int getCreatividad() {
        return creatividad;
    }

    public void setCreatividad(int creatividad) {
        this.creatividad = creatividad;
    }

    public int getDominio() {
        return dominio;
    }

    public void setDominio(int dominio) {
        this.dominio = dominio;
    }

    public double getAsistencias() {
        return asistencias;
    }

    public void setAsistencias(double asistencias) {
        this.asistencias = asistencias;
    }

    @Override
    public String toString() {
        return super.toString()+"\nMedio{" + "\ncreatividad:" + creatividad + ",\ndominio=" + dominio + ",\nasistencias=" + asistencias + '}';
    }
    
    
   
}
