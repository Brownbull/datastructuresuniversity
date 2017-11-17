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
public class Base<T> {
       private int key;
       private T info;
       
       public Base(){
           this.key=0;
           this.info=null;
       }
       public Base(int clave, T info){
           this.key=clave;
           this.info=info;
       }
       public String toString(){
           return key+","+ info.toString();
       }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }
       
}
