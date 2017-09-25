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

    public Proceso() {
        this.nombre = null;
        this.tiempo = 0;
        this.numero = 0;
    }
    
    public Proceso(Proceso p) {
        this.nombre = p.nombre;
        this.tiempo = p.tiempo;
        this.numero = p.numero;
    }

    public Proceso(String nombre, int tiempo, int numero) {
        this.nombre = nombre;
        this.tiempo = tiempo;
        this.numero = numero;
    }
    
    public Proceso(String s)
    {
        String[] campos = s.split(",");
        this.nombre=campos[0];
        this.tiempo = Integer.parseInt(campos[1]);
        this.numero = Integer.parseInt(campos[2]);
        
    } 

    @Override
    public String toString() {
        return "Proceso{" + "nombre=" + nombre + ", tiempo=" + tiempo + ", numero=" + numero + '}';
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
