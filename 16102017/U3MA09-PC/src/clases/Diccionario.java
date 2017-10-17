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
         //1.- Instanciar tabla
         //Completar
         
         //2.- Instanciar cada lista
         for (int i = 0; i < tabla.length; i++) {
             //Completar  
             
         }
         
     }
     
     public void put(int clave, T info){
         //Inserta el nuevo elemento en la lista OA por clave
         //Agregar a la clase Lista el método insertar(e):  inserta e en una LL, OA
         
         //Completar
     }
     
     public void put(Base<T> b){
         //Inserta el nuevo elemento en la lista OA por clave
         //Agregar a la clase Lista el método insertar(e):  inserta e en una LL, OA
         
         //Completar
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
         //Completar
         
         return null;
     }
     
     //Función de hash
     private int h(int clave){
         return clave % tabla.length;  //Valores desde 0 ..  tamaño-1
     }
}
