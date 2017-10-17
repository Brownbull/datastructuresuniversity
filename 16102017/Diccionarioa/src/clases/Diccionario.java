package clases;
import clases.Elemento;


/**
 * Write a description of class Diccionario here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Diccionario<T>{
      private Elemento v[];
      private int tamaño;
      
      public Diccionario(){
          tamaño= 10;
          v= new Elemento[tamaño];
          for(int i=0; i<tamaño; i++){
              v[i]= new Elemento<>();
          }
      }
       
      public Diccionario(int t){
          tamaño= t;
          v= new Elemento[tamaño];
          for(int i=0; i<tamaño; i++){
              v[i]= new Elemento<>();
          }
      }
      
      public Diccionario(Diccionario d){
          tamaño= d.tamaño;
          v= new Elemento[tamaño];
          for(int i=0; i<tamaño; i++){
              v[i]= new Elemento<>(d.v[i]);
          }
      }
      
      public boolean put(Elemento<T> e){
          int i= h(e.getClave());
          if (v[i].getEstado().equals(Estado.VACIO)){
              v[i]=e;
              System.out.println(e.getClave()+" Pos: " + i);
              return true;
          }
          else{
              i= determinaPosicionVacia(i, e.getClave());//Hacer rehashing
              
              if (i!=-1){
                  v[i]=e;
                  System.out.println("Rehash: " + e.getClave()+" Pos: " + i);
                  return true;
              }
              else{
                  return false;
              }
          }
          
      }
      
      public T get(String clave){
          return null;
      }

      public T remove(String clave){
        int i= h(clave);
        if (v[i].getEstado().equals(Estado.OCUPADO) && v[i].getClave().equals(clave)){
                T e= (T)v[i].getInfo();
                v[i].setEstado(Estado.ELIMINADO);
                return e;
          }
          else{
              i= encontrarElemento(i, clave);//Hacer rehashing
              if(i!=-1){
                T e= (T)v[i].getInfo();
                v[i].setEstado(Estado.ELIMINADO);
                return e;
              }
              else{
                  return null;
              }
          }
      }
     
      public boolean isEmpty(){
          int i=0;
          boolean vacia=true;
          while (i<tamaño && vacia){
                  i= reHash(i);
                  vacia=v[i].getEstado().equals(Estado.VACIO);
                  i++;
          }
          return vacia;
      }  
      
      public boolean containsKey(String clave){
          boolean esta=false;
          int i= h(clave);
          if (v[i].getEstado().equals(Estado.OCUPADO) && v[i].getClave().equals(clave)){
              return true;
          }
          else{
              return existe(i, clave);//Hacer rehashing
          }
          
      }
      
      public String toString(){
          StringBuilder s= new StringBuilder();
          for(int i=0; i<tamaño; i++){
              if (v[i].getEstado()==Estado.OCUPADO)
                s.append(i + " -> " + v[i].toString()+"\n");
              else{
                  s.append(i + " -> " + v[i].getEstado()+"\n");
              }
          }
          return s.toString();
      }

      private int h(String clave){
          String key= clave.toString();
          int suma=0;
          for (int i=0; i<key.length();i++){
              suma= suma + key.charAt(i);
          }
          return suma% tamaño;
      }
           
      //Rehashing secuencial, para resolver COLISIONES
      private int reHash(int i){
          return (i+1) % tamaño;
      } 
      
      private int determinaPosicionVacia(int i, String clave){
        //Iniciar rehashing
        int num=1;
        boolean vacia=false;
        while (num<tamaño && !vacia){
            i= reHash(i);
            vacia=v[i].getEstado()==(Estado.VACIO);
            num++;
        }
        if (vacia){
            return i;
        }
        else{
            return -1;
        }

      }
      
      private int encontrarElemento(int i, String clave){
        //Iniciar rehashing
        int num=1;
        boolean vacia=false;
        boolean encontrado=false;
        while (num<tamaño && !vacia && !encontrado){
            i= reHash(i);
            vacia=v[i].getEstado()==(Estado.VACIO);
            encontrado= v[i].getEstado().equals(Estado.OCUPADO) && v[i].getClave().equals(clave);
            num++;
        }
        if (vacia){
            return -1;
        }
        else{
            if (encontrado)
            {
                return i;
            }
            else{
                return -1;
            }
        }

      }
    
      private boolean existe(int i, String clave){
        //Iniciar rehashing
        int num=1;
        boolean vacia=false;
        boolean encontrado=false;
        while (num<tamaño && !vacia && !encontrado){
            i= reHash(i);
            vacia=v[i].getEstado()==(Estado.VACIO);
            encontrado= v[i].getEstado().equals(Estado.OCUPADO) && v[i].getClave().equals(clave);
            num++;
        }
        if (vacia){
            return false;
        }
        else{
            return encontrado;
        }

      }
    
   
}
