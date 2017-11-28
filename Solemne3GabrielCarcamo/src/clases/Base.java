/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;
import utiles.Rut;
import utiles.*;
/**
 * Pendiente:  K: Clave de tipo genérico.....
 * Clave: Rut
 * @author 85605410
 */
public class Base <T> implements Comparable<Base<T>>{
        private Rut key;  //key: Rut por las personas....
        private T info;
        
        public Base(){
            key=null;
            info=null;
        }
        public Base(Rut key, T e ){
              this.key= key;
              info= e;
        }
    
        public String toString(){
            return key.toString()+","+info.toString();
        }

    public Rut getKey() {
        return key;
    }

    public void setClave(Rut key) {
        this.key = key;
    }

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }
    
    public int compareTo(Base<T> b){
        return this.key.compareTo(b.getKey()); 
    }    
}
