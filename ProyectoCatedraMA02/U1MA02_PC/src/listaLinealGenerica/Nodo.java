/*
 * Nodo Genérico
 */
package listaLinealGenerica;

/**
 *
 * @author Nina
 */
public class Nodo<T>{
    private T info; //Contiene referencia a objeto de tipo T
    private Nodo<T> link;
    
    public Nodo(){
        info=null;
        link=null;
    }
    
    public Nodo(T e){
        info=e;
        link=null;
    }
    
    @Override
    public String toString(){
        return info.toString() + "->\n";
    }

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }

    public Nodo<T> getLink() {
        return link;
    }

    public void setLink(Nodo<T> link) {
        this.link = link;
    }
    
    
}
