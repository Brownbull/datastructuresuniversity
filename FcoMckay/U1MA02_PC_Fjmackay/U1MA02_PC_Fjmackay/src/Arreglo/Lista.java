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
    private int tamaño;
    private int tope;
    
    public Lista()
    {
        tamaño=10;
        tope=-1;
        v= (T[]) new Object[tamaño];
        
    }
    
    public void clear()
    {
        int i=0;
        while (i<=tope)
        {
            v[i]=null;
            i++;
        }
        tope=-1;
       
    }
    
    public void insert(T e, int i)
    {
        tope++;
        int j=tope;
        while(j>i & j>0)
        {
            v[j]=v[j-1];
            j--;
        }
        v[i]=e;
    }
    
    public int size()
    {
        return tope+1;
    }
    
    public boolean add(T e)
    {
        
        tope++;
        v[tope]=e;

        return true;
    }
    
    public T get(int i)
    {
        return v[i];
    }
    
    public void set (T e, int i)
    {
        v[i]=e;
    }
    
    public boolean contains(T e)
    {
        int i=0;
        
        while (i<=tope)
        {
            if (v[i].equals(e))
                return true;
            i++;
        }
        return false;
    }
    
    public int indexOf(T e)
    {
        int i=0;
        
        while (i<=tope)
        {
            if (v[i].equals(e))
                return i;
            i++;
        }
        return -1;
    }
    
    public boolean isEmpty()
    {
        if (tope<0)
            return true;
        else
           return false;
    }
    
    public void remove(int i)
    {
        int j=i;
        int k=i+1;
        
        if (i==tope)
        {
            v[i]=null;
            tope--;
        }
        else
        while (k<=tope)
        {
            v[j]=v[k];
            j++;
            k++;
        }
        tope=j-1;
        
    }
    
    public void remove(T e)
    {
        int i=0;
        int j=0;
        
        while (i<=tope)
        {
            if (v[i].equals(e))
            {
                v[i]=null;
                j=i+1;
                while (j<=tope)
                {
                  v[i]=v[j];
                  v[j]=null;
                  i++;
                  j++;
                }
                tope=j-2;
                this.remove(e);
            }
            i++;
        }
        
    }
    
    @Override
    public String toString()
    {
        
        StringBuffer s= new StringBuffer();
        int i=0;
        
        while(i<=tope)
        {
          s.append(v[i].toString());
          s.append("\n");
          i++;
         }
        return s.toString();  
    }
    
}
