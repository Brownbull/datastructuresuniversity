/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author 172493726
 */
public class StaticStack<T> {
    private T [] v;
    private int tope;
    
    public StaticStack() {
        v = (T[]) new Object[10];
        this.tope = -1;
    } // end of public StaticStack()
    
    public StaticStack(T[] v, int tope) {
        this.v = (T[]) new Object[tope];
        this.tope = tope;
    } // end of public StaticStack(T[] v, int tope) 
    
    public boolean push(T e){
        if (tope < 10){
            tope++;
            v[tope] = e;
            return true;
        }
        return false;
    } // end of public boolean push
    
    public T pop(){
        T e = v[tope];
        tope--;
        return e;
    } // end of public boolean push
    
    public boolean isEmpty(){
        return (tope == -1);
    } // end of public boolean push
    
   @Override
    public String toString(){
        StringBuilder s = new StringBuilder();
        for (int i = 0; i <= tope; i++){
            s.append(v[i].toString());
            s.append(" ");
        }
        return s.toString();
    } // end of public String toString()
    
    
} // end of public class StaticStack<T> 
