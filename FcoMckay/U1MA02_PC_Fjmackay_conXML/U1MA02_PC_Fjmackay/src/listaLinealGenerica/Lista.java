/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaLinealGenerica;

/**
 *
 * @author mayor
 */
import java.io.Serializable;

public class Lista<T> implements Serializable{
    private Nodo<T> lista;

    public Nodo<T> getLista() {
        return lista;
    }

    public void setLista(Nodo<T> lista) {
        this.lista = lista;
    }
    
    public Lista()
    {
        lista = null;
    }
    
     
    @Override
    public String toString()
    {
        
        StringBuffer s= new StringBuffer();
        Nodo p;
        p = lista;
        
        while(p!=null)
        {
          s.append(p.toString());
          s.append("\n");
          p=p.getLink();
         }
        return s.toString();  
    }
    
    public boolean add(T e)
    {
        Nodo p = new Nodo(e);
        p.setLink((lista));
        lista=p;
        return true;
    }
    
    public boolean isEmpty()
    {
        return lista==null;
    }
    
    public boolean addLast(T e)
    {
        if (!isEmpty())
        {
           Nodo p;
           Nodo o;
           o=new Nodo(e);
           p=lista;
        
           while(p.getLink()!=null)
           {
              p=p.getLink();
           }
           p.setLink(o);
        }
        else
            add(e);
        
        return true;
    }
    
    public void clear()
    {
        Nodo p;
        while (lista!=null)
        {
            p=lista;
            lista=lista.getLink();
            p.setInfo(null);
            p.setLink(null);
        }
    }

    
    public T get(int i)
    {
        int j=1;
        Nodo p;
        p=lista;
        
        while(p!=null)
        {
            if(i==j)
            {
                return (T)p.getInfo();
            }
            j++;
        }

        return null;
    }
    
    public void set(T e,int i)
    {
        int j=1;
        Nodo p;
        p=lista;
        while (p!=null)
        {
            if (i==j)
            {
                p.setInfo(e);
                p=null;
            }
            j++;
        }
    }
    
    public int indexOf(T e)
    {
        int j=1;
        Nodo p;
        p=lista;
        
        while (p!=null)
        {
            if(p.getInfo().equals(e))
                return j;
            p=p.getLink();
            j++;
        }
        
        return -1;
    }
    
    public boolean contains(T e)
    {
        Nodo p;
        p=lista;
        while(p!=null)
        {
            if (p.getInfo().equals(e))
                return true;
            p=p.getLink();
        }
        return false;
    }
    
    public boolean remove(T e)
    {
        Nodo p;
        Nodo t;
        p=lista;
        t=null;
        while (p!=null)
        {
            if (p.getInfo().equals(e))
            {
                if (t==null)
                {
                    p.setInfo(null);
                    lista=p.getLink();
                    p.setLink(null);
                }
                else
                {
                    t.setLink(p.getLink());
                    p.setInfo(null);
                    p.setLink(null);
                }
                return true;
            }
            t=p;
            p=p.getLink();
        }
        return false;
    }
   

    
}

    

