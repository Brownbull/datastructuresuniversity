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
            s.append(" ");
            p = p.getLink();
        }
        return s.toString();
    } // end of public String toString()
    
    public boolean add(T e){
        Nodo p = new Nodo(e);
        p.setLink(lista);
        lista = p;
        return true;
    } // end of public boolean add(T e)
    
    
} // end of public class Lista
