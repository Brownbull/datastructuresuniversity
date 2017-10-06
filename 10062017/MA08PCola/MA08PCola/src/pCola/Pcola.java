package pCola;


import clases.Elemento;



/**
 * Write a description of class Pcola here.
 * 
 * @author Nina 
 * @version 2016
 * Hacer la clase ITERABLE
 */
public class Pcola<T>{
    private Elemento<T>[] v;
    private int u;
   
    public Pcola(){
         v = new Elemento[10];
         u = 1;    
    }
    
    public void add(Elemento<T> e){
        u++;
    v[u] = e;
     subirHeap();
    }
//    public Elemento<T> remove(){
//        
//    }
//       
//    public boolean isEmpty(){
//       return false;
//    }
//    
    private void subirHeap(){
        int i, h;
        Elemento<T> aux;
        i = u;
        h = u / 2;
        while(h > 0 && v[h].getPrioridad() > v[i].getPrioridad()){
            aux = v[h];
            v[h] = v[i];
            v[i] = aux;
            i = h;
            h = i / 2;
        }
    }
//    
//    public String toString(){
//        StringBuffer s= new StringBuffer();
//        
//        return s.toString();
//    }
    
    private void bajarHeap(){
        boolean ubicado=false;
        Elemento e;
        int hijo,i, d;
        int k=1;
        
        while (k<=u/2 && !ubicado){
            i=2*k;
            hijo= i;
            if(i<u) {   //tiene hijo derecho. Elegir entre los dos hijos.
                d=2*k+1;
                if(v[i].getPrioridad() > v[d].getPrioridad())
                   hijo=d;
            }
            
            if(v[k].getPrioridad()>v[hijo].getPrioridad()){
                e= v[k];
                v[k]=v[hijo];
                v[hijo]=e;
                k=hijo;
            }
            else{
                ubicado=true;
            }
        }
    }     
}
