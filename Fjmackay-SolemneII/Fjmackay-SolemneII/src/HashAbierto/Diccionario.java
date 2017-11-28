/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HashAbierto;

import Utiles.*;
// contar(d)
// buscar(b)
// sumar(d,k)  k = diferenciacion
/**
 *
 * @author 85605410
 */
public class Diccionario <T>{
     private Lista<T>[] tabla;
     
     public Diccionario(){
         tabla=new Lista[10];
         for (int i = 0; i < tabla.length; i++) {
             tabla[i]=new Lista();
         }
     }
     
     public Diccionario(int size){
         tabla=new Lista[size];
         for (int i = 0; i < tabla.length; i++) {
             tabla[i]=new Lista();
         }
     }
     
     public void put(int clave, T info){
         //Inserta el nuevo elemento en la lista OA por clave
         //Agregar a la clase Lista el método insertar(e):  inserta e en una LL, OA
         int i = h(clave);
         Base b = new Base(clave,info);
         tabla[i].add((T)b);
         //Completar
     }
     
     public void put(Base<T> b){
         //Inserta el nuevo elemento en la lista OA por clave
         //Agregar a la clase Lista el método insertar(e):  inserta e en una LL, OA
         int i = h(b.getKey());
         tabla[i].add((T) b);;
         //Completar
     }
     
     public Boolean remove(int clave){
         Boolean ok = false;
         int i = h(clave);
         if (!tabla[i].isEmpty())
         {
             Lista<T> temp = new Lista();
             Lista<T> temp2 = new Lista();
             temp = tabla[i];
             while(!temp.isEmpty()){
                 T e = temp.remove();
                 Base b = (Base) e;
                 if (b.getKey()==clave)
                     ok=true;
                 else
                     temp2.add(e);
             }
             tabla[i]=temp2;
         }
         
         return ok;
     }
     
     //Función 2 B del diccionario
     
     public int Contar(){
         // acumulador de cantidad de productos
         int cant=0;
       
         // Para cada uno de los slots de la tabla desde 0 a m-1
         for (int i = 0; i < tabla.length ; i++) {
             // Si el slot no está vacío
             if(!tabla[i].isEmpty())
                 // Añade al contador el largo de la lista de ese slot
                 cant = cant + tabla[i].length();
         }

         //Devuelve la cantidad acumulada de elementos contados
         return cant;
     }
     
     // Función 2-C del diccionario
     
     public int MayorCantidad(){
         // Define la variable en que devolverá el indice como -1
         int indice=-1;
         // Define con un negativo el número mayor de stock
         int mayor=-1;
         
         // Para cada slot de la tabla 
         for (int i = 0; i < tabla.length ; i++) {
             // Si la tabla en ese slot no está vacía
             if(!tabla[i].isEmpty())
                 // Si el largo de la lista de ese slot es mayor que 
                 // el contador mayor
                 if (tabla[i].length()>mayor)
                 {
                     // asigna a mayor el largo de esa lista
                     mayor=tabla[i].length();
                     // asigna al índice el número del slot identificado
                     indice=i;
                 }
         }
         
         // retorna el índice que obtuvo
         return indice;
     }
    
     
     public Boolean remove(int clave, T info){
         //Completar
         int i = h(clave);
         Base b = new Base(clave,info);
         return tabla[i].remove((T) b);
     }
     
     public boolean contains(int clave ){
         //Completar
         int i = h(clave);
         if (!tabla[i].isEmpty())
         {
             Lista<T> temp = new Lista();
             temp = tabla[i];
             while (!temp.isEmpty())
             {
                T e = temp.remove();
                Base b = (Base) e;
                if (b.getKey()==clave)
                    return true;
             }
             return false;
         }
         else
            return false;
     }
     
     public boolean contains(int clave, T info ){
         int i = h(clave);
         Base b = new Base(clave,info);
         return tabla[i].remove((T) b);
     }
     
     public  boolean isEmpty(){
         for (int i = 0; i < tabla.length; i++) {
             if (!tabla[i].isEmpty())
                 return false;
         }
         return true;
     }
     
     @Override
     public String toString(){
         StringBuilder s = new StringBuilder();
         for (int i = 0; i < tabla.length; i++) {
             s.append(i);
             s.append("\n");
             if (tabla[i].isEmpty())
             {
                 s.append("vacío");
                 s.append("\n");
             }
             else
                 s.append(tabla[i].toString());
         }
         return s.toString();
     }
     
     //Función de hash
     private int h(int clave){
         return clave % 10;  //Se cambia función de hash a x%10
     }
}
