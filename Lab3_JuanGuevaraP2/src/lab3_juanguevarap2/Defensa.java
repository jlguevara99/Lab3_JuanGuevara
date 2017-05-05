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
public class Defensa extends Jugador {
    public int agresividad;
    public double altura;
    public double peso;
    public double velocidad;

    public Defensa() {
        super();
    }

    public Defensa(int agresividad, double altura, double peso, double velocidad, String nombre, String apellido, int edad, int estado, String pais, String pie, int numero, double precio, String equipo) {
        super(nombre, apellido, edad, estado, pais, pie, numero, precio, equipo);
        this.agresividad = agresividad;
        this.altura = altura;
        this.peso = peso;
        this.velocidad = velocidad;
    }

    public int getAgresividad() {
        return agresividad;
    }

    public void setAgresividad(int agresividad) {
        this.agresividad = agresividad;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return super.toString() + "\nDefensa{" + "agresividad=" + agresividad + ", \naltura=" + altura + ", \npeso=" + peso + ", \nvelocidad=" + velocidad + '}';
    }
    
    
}
