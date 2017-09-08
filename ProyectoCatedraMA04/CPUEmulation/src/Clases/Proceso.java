/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author mayor
 */
public class Proceso {
    private String nombre;
    private int tiempo;
    private int numero;

    
    public Proceso(Proceso P) {
        this.nombre = P.nombre;
        this.tiempo = P.tiempo;
        this.numero = P.numero;
    }
    
    public Proceso() {
        this.nombre = "";
        this.tiempo = 0;
        this.numero = 0;
    }

    public Proceso(String nombre, int tiempo, int numero) {
        this.nombre = nombre;
        this.tiempo = tiempo;
        this.numero = numero;
    }
    @Override
    public String toString() {
        return "nombre=" + nombre + ", tiempo=" + tiempo + ", numero=" + numero + "\n";
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
}
