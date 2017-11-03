/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import utiles.Rut;

/**
 *
 * @author Nina Valdivia 2016-2
 */
public class Diccionario<T> {
    private Nodo<T> raiz;
    
    public Diccionario(){
        raiz=null;
    }
    
    public String toString(){
         StringBuilder s= new StringBuilder();
         enOrden(raiz, s);  //Construye el StringBuilder mientras recorre en ABB enOrden
         return s.toString();

    } 
    
    private void  enOrden(Nodo<T> p, StringBuilder s){
        if (p!=null){
            enOrden(p.getIzq(),s);
            s.append(p.getDato().toString());
            enOrden(p.getDer(), s);
        }
    }
    
    public String toStringEnOrden(){
         StringBuilder s= new StringBuilder();
         enOrden(raiz, s);  //Construye el StringBuilder mientras recorre en ABB enOrden
         return s.toString();

    } 
    
    public String toStringPostOrden(){
         StringBuilder s= new StringBuilder();
         postOrden(raiz, s);  //Construye el StringBuilder mientras recorre en ABB enOrden
         return s.toString();

    } 
    
    private void  postOrden(Nodo<T> p, StringBuilder s){
        if (p!=null){
            postOrden(p.getIzq(),s);
            postOrden(p.getDer(), s);
            s.append(p.getDato().toString());
        }
    }
    
    public String toStringPreOrden(){
         StringBuilder s= new StringBuilder();
         preOrden(raiz, s);  //Construye el StringBuilder mientras recorre en ABB enOrden
         return s.toString();

    } 
    
    private void  preOrden(Nodo<T> p, StringBuilder s){
        if (p!=null){
            s.append(p.getDato().toString());
            preOrden(p.getIzq(),s);
            preOrden(p.getDer(), s);
        }
    }
    
  
    public void put(Base<T> e){
        raiz=insertar(raiz, e);
    }
    
    public boolean isEmpty(){
        return raiz==null;
    }
    
    //contains()
    public boolean contains(Rut clave){
        return existe(raiz, clave);
        
    }
    
    private boolean existe(Nodo<T> p, Rut clave){
        if (p==null)
            return false;
        else
            if (clave.compareTo(p.getDato().getClave()) == 0)
                return true;
           else
                if (clave.compareTo(p.getDato().getClave()) < 0)
                    return existe(p.getIzq(), clave);
                else
                    return existe(p.getDer(), clave);
                     
    }
    
    public void mostrarRut(char dv){
        mostrar(raiz, dv);
    }
    
    private void mostrar(Nodo<T> p, char dv){
        if (p!=null){
            if (p.getDato().getClave().getdVerificador() == dv){

                System.out.println(p.getDato().getClave());
            }
            mostrar(p.getIzq(), dv);
            mostrar(p.getDer(),dv);
        }
    }
    
    public Base<T> remove(Rut clave){
        
        return null;
    }
    
    public Base<T> get(Rut clave){
        return obtener(raiz, clave);
    }
    
    public Base<T> obtener(Nodo<T> p, Rut clave){
        if (p==null){
            return null;
        }
        else{
            if (clave.compareTo(p.getDato().getClave()) == 0){
                return p.getDato();
            }
            else{
                if (clave.compareTo(p.getDato().getClave()) < 0){
                    return obtener(p.getIzq(), clave);
                }
                else{
                    return obtener(p.getDer(), clave);
                }
            }
        }
        
    }
    
    //Métodos auxiliares
    private Nodo<T> insertar(Nodo<T> p, Base<T> e){
        if (p==null){
            p= new Nodo<>(e);
            System.out.println("Creado.. " + e.getClave().toString());
        }
        else{
            if (e.getClave().compareTo(p.getDato().getClave()) < 0){
                System.out.println("\tHijo izq de " + p.getDato().getClave().toString());
                p.setIzq(insertar(p.getIzq(), e));
            }
            else{
                if (e.getClave().compareTo(p.getDato().getClave()) > 0){
                    System.out.println("\tHijo der de " + p.getDato().getClave().toString());
                    p.setDer(insertar(p.getDer(), e));
                }
                else{
                    System.out.println("\tClave ya existe...");
                }
            }           
        }
        return p;
    }
    

    public int size(){
        return contar(raiz);
    }
    
    public int contar(Nodo<T> p){
        if (p==null)
                return 0;
        else
                return 1 + contar(p.getIzq()) + contar(p.getDer());
    }
        
    
    
}
