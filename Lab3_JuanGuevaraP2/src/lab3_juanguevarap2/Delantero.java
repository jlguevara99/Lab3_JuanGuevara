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
public class Delantero extends Jugador {
    public int definicion;
    public double altura;
    public double velocidad;
    public double promedio;

    public Delantero() {
        super();
    }

    public Delantero(int definicion, double altura, double velocidad, double promedio, String nombre, String apellido, int edad, int estado, String pais, String pie, int numero, double precio, String equipo) {
        super(nombre, apellido, edad, estado, pais, pie, numero, precio, equipo);
        this.definicion = definicion;
        this.altura = altura;
        this.velocidad = velocidad;
        this.promedio = promedio;
    }

    public int getDefinicion() {
        return definicion;
    }

    public void setDefinicion(int definicion) {
        this.definicion = definicion;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    @Override
    public String toString() {
        return super.toString()+ "\nDelantero{" + "\ndefinicion=" + definicion + ", \naltura=" + altura + ", \nvelocidad=" + velocidad + ", \npromedio=" + promedio + '}';
    }
    
}
