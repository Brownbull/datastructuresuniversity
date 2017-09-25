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
public class ColaLLS<T> {
    private Nodo<T> primero;
    private Nodo<T> ultimo;

    public Nodo<T> getPrimero() {
        return primero;
    }

    public void setPrimero(Nodo<T> primero) {
        this.primero = primero;
    }

    public Nodo<T> getUltimo() {
        return ultimo;
    }

    public void setUltimo(Nodo<T> ultimo) {
        this.ultimo = ultimo;
    }

    public ColaLLS() {
        //sin nodo cabecera
        //this.primero = null;
        //this.ultimo = null;
        //Con nodo cabecera
        Nodo<T> nuevo = new Nodo();
        primero=nuevo;
        ultimo=nuevo;
    }
    
    public boolean isEmpty()
    {
        return primero.equals(ultimo);
    }
    
    public boolean add(T e)
    {
        Nodo<T> nuevo = new Nodo();
        
        ultimo.setInfo(e);
        ultimo.setLink(nuevo);
        ultimo=nuevo;
        
        return true;
    }
    
    public T remove()
    {
        T e;
        e = primero.getInfo();
        primero = primero.getLink();
        return e;
       
    }
    
    

    @Override
    public String toString() {
        Nodo<T> puntero = primero;
        StringBuilder s = new StringBuilder();
        
        while(puntero!=null)
        {
          if (puntero.getInfo()!=null)
          {
             s.append("info=> ");
             s.append(puntero.getInfo());
             s.append(" ");
          }
          puntero=puntero.getLink();
        }
        
        return s.toString();
    }
       

}
