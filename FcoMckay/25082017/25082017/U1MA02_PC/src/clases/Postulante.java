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
 * @author 122639207
 */
public class Postulante {
    private Rut rut;
    private Nombre nombre;
    private String cargo;
    
    public Postulante(){
        nombre = new Nombre();
        rut = new Rut();
        cargo=null;
    }
    
    public Postulante(Postulante p)
    {
        nombre=p.nombre;
        rut=p.rut;
        cargo=p.cargo;
    }
    
    public Postulante(String s)
    {
        String[] o = s.split(",");
        rut=new Rut(Integer.parseInt(o[0]));
        nombre=new Nombre(o[1]);
        cargo=o[2];
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
    
    @Override
    public String toString()
    {
        StringBuilder s = new StringBuilder();
        s.append("Rut=");
        s.append(rut.toString());
        s.append(",");
        s.append("Nombre=");
        s.append(nombre.toString());
        s.append(",");
        s.append("Cargo=");
        s.append(cargo);
        
        return s.toString();
    }
    
    
}
