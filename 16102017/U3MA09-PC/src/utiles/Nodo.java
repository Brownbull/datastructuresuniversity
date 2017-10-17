package utiles;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 * Nodo Genérico para crear listas genéricas
 * @author Nina Valdivia Prueba 02  25 octubre 2016

 */
//T: representa en forma genérica el tipo de datos de los elementos
public class Nodo<T> {
    private T info;
    private Nodo<T> link;
    
    public Nodo(){
        info= null;
        link=null;
    }
    
    public Nodo(T  elemento){
        info= elemento; // Sin new
        link= null;
    }
    
    public String toString(){
        return info.toString();
    }

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }

    public Nodo<T> getLink() {
        return link;
    }

    public void setLink(Nodo<T> link) {
        this.link = link;
    }
    
    
            
            
    
}
