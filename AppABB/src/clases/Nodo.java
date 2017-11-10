 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *Representa el nodo de un ABB
 * @author 85605410
 */
public class Nodo {
    private Base dato;
    private Nodo izq;
    private Nodo der;
    
    public Nodo(){
        dato=null;
        izq=null;
        der=null;
    }
    public Nodo(Base e){
        dato=e;
        izq=null;
        der=null;
    }
    
    public String toString(){
        return dato.toString();
    }

    public Base getDato() {
        return dato;
    }

    public void setDato(Base dato) {
        this.dato = dato;
    }

    public Nodo getIzq() {
        return izq;
    }

    public void setIzq(Nodo izq) {
        this.izq = izq;
    }

    public Nodo getDer() {
        return der;
    }

    public void setDer(Nodo der) {
        this.der = der;
    }
    
    
}
