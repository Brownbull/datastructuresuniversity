/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.Objects;

/**
 *
 * @author 122639207
 */
public class Stack<T> {
    private T[] v;
    private int tope;

    public Stack() {
        this.tope=-1;
        this.v= (T[]) new Object[10];
    }
    
    public Stack(int tamaño){
        this.tope=-1;
        this.v= (T[]) new Object[tamaño];
    }

    @Override
    public String toString() {
        StringBuilder st =  new StringBuilder();
        for (int i=tope;i>-1;i--)
        {
            st.append("v= ");
            st.append(pop());
            st.append(" ");
        }
        return st.toString();
    }

    public boolean isEmpty()
    {
        return tope==-1;
    }
    
    public boolean push(T e)
    {
        if (tope<v.length)
        {
           tope++;
           v[tope]=e;
           return true;
        }
        return false;
    }
    
    public boolean pop(T e)
    {
        if (tope>-1)
          if (v[tope]==e)
          {
            v[tope]=null;
            tope--;
            return true;
          }
        
        return false;
    }
    
    public T pop()
    {
        if (tope>-1)
        {
           T e;
           e=v[tope];
           tope--;
           return e;
        }
        return null;
    }
        
    public T[] getV() {
        return v;
    }

    public void setV(T[] v) {
        this.v = v;
    }

    public int getTope() {
        return tope;
    }

    public void setTope(int tope) {
        this.tope = tope;
    }
    
}
