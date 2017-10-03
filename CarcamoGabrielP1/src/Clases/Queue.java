/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Clases.Nodo;

/**
 *
 * @author mayor
 */
public class Queue<T> {
    private Nodo<T> primero;
    private Nodo<T> ultimo;
    
    public Queue(){
        Nodo<T> p = new Nodo();
        primero = p;
        ultimo = p;
    }
    public Nodo<T> getPrimero() {
        return primero;
    }
    
    public boolean isEmpty(){
        return (primero==ultimo);
    }
    public boolean add(T e){
        Nodo<T> p = new Nodo();
        ultimo.setInfo(e);
        ultimo.setLink(p);
        ultimo = p;
        
        return true;
    }
    @Override
    public String toString()
    {
        StringBuilder s= new StringBuilder();
        Nodo<T> p;
        p = primero;
        while(p != ultimo)
        {
            s.append(p.getInfo().toString()+" ");
            p = p.getLink();
        }
        return s.toString();
    }
    public T remove(){
        T e;
        e = primero.getInfo();
        primero = primero.getLink();
        return e;
    }
}
