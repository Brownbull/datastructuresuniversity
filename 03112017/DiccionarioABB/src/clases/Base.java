/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;
import utiles.*;
/**
 * Pendiente:  K: Clave de tipo genérico.....
 * Clave: Rut
 * @author 85605410
 */
public class Base <T> implements Comparable<Base<T>>{
        private Rut clave;  //clave: Rut por las personas....
        private T info;
        
        public Base(){
            clave=null;
            info=null;
        }
        public Base(Rut clave, T e ){
              this.clave= clave;
              info= e;
        }
    
        public String toString(){
            return clave.toString()+","+info.toString();
        }

    public Rut getClave() {
        return clave;
    }

    public void setClave(Rut clave) {
        this.clave = clave;
    }

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }
    
    public int compareTo(Base<T> b){
        return this.clave.compareTo(b.getClave()); 
    }    
}
