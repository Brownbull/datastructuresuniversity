package clases;
import utiles.Persona;


/**
 * Write a description of class Elemento here.
 * 
 * @author NVA 
 * @version (Nov2011)
 */
public class Elemento<T> {
    private Estado estado; 
    private String clave;
    private T info;
    
    public Elemento(){
        estado=Estado.VACIO;
        clave=null;
        info=null;
    }
    public Elemento(String clave, T e){
        this.estado=Estado.OCUPADO;
        this.clave=clave;
        this.info=e;
    }
    
    public Elemento(Elemento e){
        this.estado=e.estado;
        this.clave=e.clave;
        this.info=(T)e.info;
    }
    
    public String toString(){
        return estado + " -> "+ clave.toString() + " -> " + info.toString();
    }
    
    public void setEstado(Estado e){
        estado=e;
    }
    
    public Estado getEstado(){
        return estado;
    }
    
    public void setInfo(T p){
        info=p;
    }
        
    public T getInfo(){
        return info;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
  
 
    
}
