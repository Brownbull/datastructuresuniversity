/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import utiles.Nombre;
import utiles.Rut;

/**
 *
 * @author guillermo
 */
public class Cliente {
    private Rut rut;
    private Nombre nombre;
    private String nombre_banco;
    private int tiempo;

    public Cliente(){
        rut = new Rut();
        nombre = new Nombre();
        nombre_banco = "";
        tiempo = 0;
    }
    
    public Cliente(String c){
        String data[] = c.split(",");
        rut = new Rut(data[0]);
        nombre = new Nombre(data[1]);
        nombre_banco = data[2];
        tiempo = Integer.parseInt(data[3]);
        
    }
    public Cliente(Cliente c){
        this.rut = c.rut;
        this.nombre = c.nombre;
        this.nombre_banco = c.nombre_banco;
        this.tiempo = c.tiempo;
    }

    @Override
    public String toString() {
        return rut + "," + nombre + "," + nombre_banco + "," + tiempo+" Minutos";
    }

    public Rut getRut() {
        return rut;
    }

    public void setRut(Rut rut) {
        this.rut = rut;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public void setNombre(Nombre nombre) {
        this.nombre = nombre;
    }

    public String getNombre_banco() {
        return nombre_banco;
    }

    public void setNombre_banco(String nombre_banco) {
        this.nombre_banco = nombre_banco;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }
        

}
