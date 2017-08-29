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
 * @author 172493726
 */
public class Postulante {
    private Nombre nombre;
    private Rut rut;
    private String cargo;

    public Postulante(Nombre nombre, Rut rut, String cargo) {
        this.nombre = nombre;
        this.rut = rut;
        this.cargo = cargo;
    }

    public Postulante() {
        this.nombre = new Nombre();
        this.rut = new Rut();
        this.cargo = "";
    }
    
    public Postulante(Postulante a) {
        this.nombre = a.nombre;
        this.rut = a.rut;
        this.cargo = a.cargo;
    }
    
    public Postulante(String c){
        //100,Estado,18676228-2,Juan Valdés Arias,120000.0,ACTIVA
        String[]datos;
        datos= c.split(",");
        nombre = new Nombre(datos[0]);
        rut= new Rut(datos[1]);  //Instanciar
        cargo=datos[0];
    }
    

    @Override
    public String toString() {
        return "Postulante{" + "nombre=" + nombre + ", rut=" + rut + ", cargo=" + cargo + '}' + '\n';
    }

    public Nombre getNombre() {
        return nombre;
    }

    public void setNombre(Nombre nombre) {
        this.nombre = nombre;
    }

    public Rut getRut() {
        return rut;
    }

    public void setRut(Rut rut) {
        this.rut = rut;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    
}
