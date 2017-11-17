package utiles;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 * Lista genérica (Nodos Genéricos)
 * @author Nina Valdivia Prueba 02  25 octubre 2016

 */
public class Lista<T> {
     private Nodo<T> lista;  //Puntero al primer nodo
     
     public Lista(){
         lista=null;
     }
     
     public void add(T e){
         //Agrega el nuevo elemento al comienzo de la lista
         Nodo<T> p;
         p= new Nodo<T>(e);
         p.setLink(lista);
         lista=p;
     }
     
     public void addLast(T e){
         Nodo<T> p= new Nodo<T>(e);
        
         if (lista==null){
             lista=p;
         }
         else{
            Nodo<T> t;
            Nodo<T> q;
            t= lista;
            q= t;

            while (t!=null){
                q=t;
                t= t.getLink();
            }
            //Agregar al final....
            q.setLink(p);
         }
     }
     
     public String toString(){
         StringBuilder s= new StringBuilder();
         Nodo<T> p;
         p= lista;
         while (p!= null){
             s.append(p.getInfo().toString());
             s.append("\n");
             //Avance
             p= p.getLink();
         }
         return s.toString();
     }
     
     public boolean remove(T e){
         Nodo<T>t;
         Nodo<T>q;
         t= lista;
         q=t;
         boolean encontrado=false;
         //Buscar el elmento
         while (t!=null && !encontrado){
             if (t.getInfo().equals(e)){
                 encontrado=true;
             }
             else{
                 q=t;
                 t=t.getLink();
             }
         }        
         if (encontrado){
             //Es el primero?
             if (t==q){
                 lista= lista.getLink();
             }
             else{
                 //Cualquier otro 
                 q.setLink(t.getLink());
             }
             return true;
         }
         else{
             return false;
         }
     }
     
     /**
      * Elimina el PRIMER elemento de la lista
      * @return elemento de tipo genérico T
      */
     public T remove(){
         T e= lista.getInfo();
         lista= lista.getLink();
         return e;
     }
     
     public boolean isEmpty(){
         return lista==null;
     }
     
     
     
}
