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
public class DinamicQueue<T> {
    private Nodo<T> first;
    private Nodo<T> last;

    public DinamicQueue() {
        Nodo<T> p = new Nodo();
        this.first = p;
        this.last = p;
    }
    
    public DinamicQueue(Nodo<T> first, Nodo<T> last) {
        this.first = first;
        this.last = last;
    }
    
    public boolean isEmpty(){
        return (first == last); // using header node
    }
    
    public boolean add(T e){
        Nodo<T> p = new Nodo();
        last.setInfo(e);
        last.setLink(p);
        last = p;
        return true;
    }
    
    @Override
    public String toString(){
        StringBuilder s = new StringBuilder();
        Nodo<T> p;
        p = first;
        while (p != last){
            s.append(p.getInfo().toString());
            //  s.append(p.toString());
            s.append(" ");
            p = p.getLink();
        }
        return s.toString();
    } // end of public String toString()
    
    public T remove(){
        T e;
        e = first.getInfo();
        first = first.getLink();
        return e;
    }
} // end of public class DinamicQueue<T>
