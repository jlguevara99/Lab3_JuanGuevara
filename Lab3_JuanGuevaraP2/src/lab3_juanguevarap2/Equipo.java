/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_juanguevarap2;

import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class Equipo {
    public String nombre;
    public int palma;
    public ArrayList<Jugador> lista;

    public Equipo() {
    }

    public Equipo(String nombre, int palma, ArrayList<Jugador> lista) {
        this.nombre = nombre;
        this.palma = palma;
        this.lista = lista;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPalma() {
        return palma;
    }

    public void setPalma(int palma) {
        this.palma = palma;
    }

    public ArrayList<Jugador> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Jugador> lista) {
        this.lista = lista;
    }

    @Override
    public String toString() {
        return "Equipo{" + "nombre=" + nombre + ", palma=" + palma + ", lista=" + lista + '}';
    }
    
}
