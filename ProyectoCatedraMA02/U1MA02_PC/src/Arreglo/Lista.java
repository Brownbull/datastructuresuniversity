/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arreglo;

/**
 *
 * @author mayor
 */
public class Lista<T> {
    private T [] v;
    private int size;
    private int limit;
    
    public Lista(){
        size = 10;
        limit = -1;
        v = (T[]) new Object[size]; // Object is a superclass
    } // end of public Lista()
    
    public boolean add(T e){
        limit++;
        v[limit] = e;
        return true;
    } // end of public boolean add(T e)
    
    @Override
    public String toString(){
        StringBuilder s = new StringBuilder();
        for (int i = 0; i <= limit; i++){
            s.append(v[i].toString());
            s.append(" ");
        }
        return s.toString();
    } // end of public String toString()
    
    
} // end of public class Lista<T> 
