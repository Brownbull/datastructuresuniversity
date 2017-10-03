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
public class Lista<T> {
    private Nodo<T> lista;
    
    public Lista()
    {
        lista = null;
    }
    
    @Override
    public String toString()
    {
        StringBuilder s= new StringBuilder();
        Nodo p;
        p = lista;
        while(p != null)
        {
            s.append(p.toString()+" ");
            p = p.getLink();
        }
        return s.toString();
    }
    
    public boolean add(T e) //nuevo nodo al inicio
    {
        Nodo p = new Nodo(e);
        p.setLink(lista);
        lista = p;
        return true;
    }
    
    public boolean addLast(T e)
    {
        Nodo p = new Nodo(e);
        if(lista == null)
        {
            lista = p;
        }
        else
        {
            Nodo j;
            Nodo t;
            j = lista;
            t = j;
            while(t != null)
            {
                j = t;
                t = t.getLink();
            }
            j.setLink(p);
        }
        return true;
    }
    public boolean isEmpty()
    {
        return (lista==null);
    }
    public boolean buscar(T e)
    {
        Nodo p;
        p = lista;
        boolean existe = false;
        while(p != null && !existe)
        {
            if(p.getInfo().equals(e))
                existe = true;
            else
                p = p.getLink();
        }
        return existe;
    }
    public T remove()
    {
        T e = lista.getInfo();
        lista = lista.getLink();
        return e;
    }
    public boolean remove(T e)
    {
        Nodo<T> t;
        Nodo<T> q;
        t=lista;
        q=t;
        boolean encontrado=false;
        while(t!=null && !encontrado)
        {
            if(t.getInfo().equals(e))
                encontrado=true;
            else{
                q=t;
                t=t.getLink();
            }
        }
        if(encontrado)
        {
            if(t==q){
                lista=lista.getLink();
            }
            else{
                q.setLink(t.getLink());
            }
            return true;
        }
        else
            return false;
    }
}
