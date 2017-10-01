/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras;

/**
 *
 * @author mayor
 */
public class Lista<T> {
    private Nodo<T> lista;
    
    public Lista (){
        lista = null;
    }
    
    @Override
    public String toString(){
        StringBuilder s = new StringBuilder();
        Nodo p;
        p = lista;
        while (p != null){
            s.append(p.getInfo().toString());
            //  s.append(p.toString());
            s.append("\n");
            p = p.getLink();
        }
        return s.toString();
    } // end of public String toString()
    
    public boolean addToStart(T e){
        Nodo p = new Nodo(e);
        p.setLink(lista);
        lista = p;
        return true;
    } // end of public boolean add(T e)
    
    public boolean addToEnd(T e){
        Nodo p = new Nodo(e);
        if (lista == null){
            lista = p;
        }
        else{
            Nodo a = lista;
            Nodo s = lista;
            while (s != null){
                a = s;
                s = s.getLink();
            }
            a.setLink(p);
        }
        return true;
    } // end of public boolean add(T e)
    
    public boolean isEmpty(){
        return (lista == null);
    } // end of isEmpty
    
    public boolean buscar(T e){
        Nodo p = lista;
        while (p != null)
        {
            if (p.getInfo().equals(e)){
                return true;
            }
            p = p.getLink();
        }
        return false;
    } // end of public boolean add(T e)
    
    public boolean removefirst(){
        Nodo p;
        p = lista;
        if (p != null){
            lista = p.getLink();
            p = null;
            return true;
        }
        else
        {
            return false;
        }
        
    }      
    
    public boolean removelast(){
        if (lista == null){
            return false;
        }
        else{
            Nodo a = lista;
            Nodo s = lista;
            while (s.getLink() != null){
                a = s;
                s = s.getLink();
            }
            a.setLink(null);
            return true;
        }
    }
    
    public int count(){
        Nodo a = lista;
        int counter = 0;
        if (lista != null) {
            while(a !=null){
                counter++;
                 a = a.getLink();
            }           
        }
        return counter;
    }
            
    public boolean remove(T e){
        Nodo left, right = lista;
        if (right.getInfo().equals(e)){
            lista = lista.getLink();
            return true;
        }
        else{
            // start positions
            left = right;
            right = right.getLink();
            
            // start iteration
            while (right != null)
            {
                if (right.getInfo().equals(e)){
                    right = right.getLink();
                    left.setLink(right);
                    return true;
                }
                left = right;
                right = right.getLink();
            }
        }
        return false;
    } // end of public boolean add(T e)*/
    
} // end of public class Lista
