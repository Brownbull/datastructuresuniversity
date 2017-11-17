/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import utiles.Lista;

/**
 *
 * @author 85605410
 */
public class Diccionario <T>{
     private Lista<T>[] tabla;
     
     public Diccionario(){
         tabla = new Lista[10];
         for(int i = 0; i < tabla.length; i++) {
             tabla[i] = new Lista();  
         }
     }
     
     public void put(int clave, T info){
         int i=h(clave);
         tabla[i].addLast(info);
     }
     
     public void put(Base<T> b){
        int clave= b.getKey();
        int i=h(clave);
        tabla[i].addLast(b.getInfo());
     }
    
     public T remove(int clave){
         //Completar
         return null;
     }
     
     public boolean contains(int clave ){
         //Completar
         return false;
     }
     
     public  boolean isEmpty(){
         //Completar
         return false;
     }
     
     @Override
     public String toString(){
         StringBuilder s= new StringBuilder();
         for(int i = 0; i < tabla.length; i++) {
             s.append(i+":"+tabla[i].toString());
             s.append("FIN\n");
         }
         return s.toString();
     }
     
     //Función de hash
     private int h(int clave){
         return clave % tabla.length;  //Valores desde 0 ..  tamaño-1
     }
}
