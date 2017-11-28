package Heap;


public class Pcola<T>{
    private Elemento<T>[] v;
    private int u;
   
    public Pcola(){
         v =new Elemento[100];         
         u=0;
    }
    public Pcola(int n){
         v =new Elemento[n];         
         u=0;
    }
    public void add(Elemento<T> e){
        u++;
        v[u]=e;
        subirHeap(); 
    }
    
    public Elemento<T> remove(){
        Elemento<T> e;
        e=v[1];
        v[1]=v[u];
        u--;
        bajarHeap();
        return e;
    }
       
    public boolean isEmpty(){
       return (u==0);
    }
    
    private void subirHeap(){
        int i, h;
        Elemento<T> aux;
        i=u;
        h=u/2;
        while(h>0&&v[h].getPrioridad()>v[i].getPrioridad()){
            aux=v[h];
            v[h]=v[i];
            v[i]=aux;
            i=h;
            h=i/2;
        }
    }
    
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
    public String toString(){
        StringBuffer s= new StringBuffer();
        Pcola<T> AUX = new Pcola<>();
        Elemento<T> e;
        while (! isEmpty()){
            e = remove();
            AUX.add(e);
            s.append(e.getInfo().toString()+" ");
        }             
        s.append("\n");

        while (! AUX.isEmpty()){
            e = AUX.remove();
            add(e);
        }
        return s.toString();
    }
}
