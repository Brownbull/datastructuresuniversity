/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author 85605410
 */
public class Diccionario<T> { 
    private Tabla<T> tabla;
    
    public Diccionario(){
        tabla= new Tabla();
    }    
    public Diccionario(int size){
        tabla= new Tabla(size);
    }    
    public Diccionario(Diccionario d){
        tabla= new Tabla(d.tabla);      
    }
    
    @Override
    public String toString(){        
        return tabla.toString();
    }  
    public boolean put(Base<T> e){
        return tabla.put(e);
    }
    public T get(String clave){
        return tabla.get(clave);
    }
    public boolean remove(String clave){
       return tabla.remove(clave);
    }  
    public boolean remove(T objeto){
        return tabla.remove(objeto);
    }
    public boolean contains(String clave){
        return tabla.contains(clave);
    }
    public boolean contains(T objeto){
        return true;
    }
    public boolean isEmpty(){
        return tabla.isEmpty();
    }
    
}
