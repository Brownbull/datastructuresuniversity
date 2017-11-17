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
public class Nodo<T> {
    private Base<T> dato;
    private Nodo<T> izq;
    private Nodo<T> der;
    
    public Nodo(){
        dato=null;
        izq=null;
        der=null;
    }
    public Nodo(Base<T> e){
        dato=e;
        izq=null;
        der=null;
    }
    
    public String toString(){
        return dato.toString();
    }

    public Base<T> getDato() {
        return dato;
    }

    public void setDato(Base<T> dato) {
        this.dato = dato;
    }

    public Nodo<T> getIzq() {
        return izq;
    }

    public void setIzq(Nodo<T> izq) {
        this.izq = izq;
    }

    public Nodo<T> getDer() {
        return der;
    }

    public void setDer(Nodo<T> der) {
        this.der = der;
    }
    
    
}
