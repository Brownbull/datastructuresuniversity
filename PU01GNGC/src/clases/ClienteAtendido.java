/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import utiles.Rut;

/**
 *
 * @author guillermo
 */
public class ClienteAtendido {
    private Rut rut;
    private String nombre_banco;
    
    public ClienteAtendido(){
        rut = new Rut();
        nombre_banco = "";
    }
    
    public ClienteAtendido(Cliente c){
        rut = c.getRut();
        nombre_banco = c.getNombre_banco();
    }

    @Override
    public String toString() {
        return rut + "," + nombre_banco;
    }
    
    public Rut getRut() {
        return rut;
    }

    public void setRut(Rut rut) {
        this.rut = rut;
    }

    public String getNombre_banco() {
        return nombre_banco;
    }

    public void setNombre_banco(String nombre_banco) {
        this.nombre_banco = nombre_banco;
    }
    
    
}
