/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author nina.valdivia
 */
public class Tabla<T> {
    private Base<T> []v;
     
    public Tabla(){
        v=new Base[10];
        for(int i=0; i < 10; i++){
            v[i]= new Base<>();
        }
    }    
    public Tabla(int tamaño){
        v=new Base[tamaño];
        for(int i=0; i<tamaño;i++){
            v[i]= new Base<>();
        }
    }    
    public Tabla(Tabla d){
        v=new Base[d.v.length];
        
        int i=0;
        for(Base<T> e: d.v){
            v[i]= new Base<>(e);
            i++;
        }
        
    }  
    public String toString(){
        StringBuilder s= new StringBuilder();
        int i=0;
        for(Base<T> e: v){
            if (e.getEstado().equals(Estado.OCUPADO)){
                s.append(i);
                s.append(" ,");
                s.append(h(e.getClave()));
                s.append(" ,");
                s.append(e.getInfo().toString());
                s.append("\n");                
            }
            else{
                s.append(i);
            }
            i++;
        }
        return s.toString();
    }    
    private int h(String clave){
        int suma=0;
        for(int i=0; i<clave.length();i++){
            suma=suma + clave.charAt(i);
        }
        return suma%v.length;
    }            
    public boolean put(Base<T> e){
        String clave= e.getClave();
        int i=h(clave);
        //if(e.getEstado().equals(Estado.VACIO) || e.getEstado().equals(Estado.ELIMINADO))
        
        if(!v[i].getEstado().equals(Estado.OCUPADO)){
            v[i]=e;
            v[i].setEstado(Estado.OCUPADO);
            return true;
        }
        else{
            int p;
            int num=1; //<v.lenth
            boolean vacia=false;
            while (num<v.length && !vacia ){
                p= (i+num)% v.length;  //Se puede hacer rehash(p)
                if (!v[p].getEstado().equals(Estado.OCUPADO)){
                    v[p]=e;
                    v[p].setEstado(Estado.OCUPADO);
                    vacia=true;
                }
                else{
                    num++;  //cuenta el número de re-hash
                }               
            }
            return vacia;  //true=> agregado  false=> No pudo agregar. Tabla llena
        }
    }  
    public T get(String clave){
        int i=h(clave);
        if(v[i].getEstado().equals(Estado.OCUPADO))
            return v[i].getInfo();
        else
            return null;
    }
    public boolean remove(String clave){
        int i= h(clave);
        if(v[i].getEstado().equals(Estado.OCUPADO)){
            if (v[i].getClave().equals(clave)){
                //Encontrado!! eliminar
                v[i].setEstado(Estado.ELIMINADO);
                //v[i]=null; //optativo
                return true;
            }
            else{
                int num=1;
                int p=i;
                boolean vacia=false;
                boolean encontrado=false;
                while (num<v.length && !vacia && !encontrado){
                    p= (i+num)%v.length; //re-hash
                    vacia=v[p].getEstado().equals(Estado.VACIO);
                    encontrado=v[p].getEstado().equals(Estado.OCUPADO) && 
                            v[p].getClave().equals(clave);
                    num++;
                }
                if (encontrado)
                    v[p].setEstado(Estado.ELIMINADO);
                return encontrado;
            }
        }
        else{
            int num=1;
            int p=i;
            boolean vacia=v[p].getEstado().equals(Estado.VACIO);;
            boolean encontrado=false;
            while (num<v.length && !vacia && !encontrado){
                p= (i+num)%v.length; //re-hash
                vacia=v[p].getEstado().equals(Estado.VACIO);
                encontrado=v[p].getEstado().equals(Estado.OCUPADO) && 
                        v[p].getClave().equals(clave);
                num++;
            }
            if (encontrado)
                v[p].setEstado(Estado.ELIMINADO);
            return encontrado;
         
        }
    }
    
    public boolean remove(T objeto){
        for (Base<T> v1 : v) {
            if (v1.getInfo().equals(objeto) == true) {
                v1.setEstado(Estado.ELIMINADO);
                return true;
            }
        }
       return false;
    }
    
    public boolean contains(String clave){
        int i=h(clave);
        for (Base<T> v1 : v) {
            if (v1.getEstado().equals(Estado.OCUPADO)) {
                if (v1.getClave().compareTo(clave) == 0) {
                    return true;
                }
            }
        }
        return false ;
    }
    public boolean contains(T objeto){
        for (Base<T> v1 : v) {
            if (v1.getInfo().equals(objeto) && v1.getEstado().equals(Estado.OCUPADO)) {
                return true;
            }
        }
       return false;
    }
    public boolean isEmpty(){
        for(int j=0; j<v.length; j++){
            if(v[j].getEstado().equals(Estado.OCUPADO)){
                return false;
            }
        }
        return true;
    }
}
