/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras;


/**
 *
 * @author guillermo
 */
public class Queue<T> {
    private Nodo<T> primero;
    private Nodo<T> ultimo;
    
    public Queue(){
        Nodo<T> p = new Nodo();
        primero = p;
        ultimo = p;
    }
    
    public boolean isEmpty(){
        return(primero==ultimo);
    }
    
    public boolean Add(T e){
        Nodo<T> p = new Nodo();
        ultimo.setInfo(e);
        ultimo.setLink(p);
        ultimo = p;
        return true;
    }
    public T remove(){
        T e;
        e = primero.getInfo();
        primero = primero.getLink();
        return e;
    }
    @Override
    public String toString(){
        StringBuilder s = new StringBuilder();
        Nodo<T> p;
        p = primero;
        while (p != ultimo){
            s.append(p.getInfo().toString());
            //  s.append(p.toString());
            s.append("\n");
            p = p.getLink();
        }
        
        return s.toString();
    } // end of public String toString()    

    public Nodo<T> getPrimero() {
        return primero;
    }

    public void setPrimero(Nodo<T> primero) {
        this.primero = primero;
    }
    
}
