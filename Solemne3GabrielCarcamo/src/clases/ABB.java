/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 */
public class ABB {
    private Nodo raiz;
    
    public ABB(){
        raiz = null;
    }
    
    @Override
    public String toString(){
//        return raiz.toString();
        StringBuilder s = new StringBuilder();
        return enOrden(raiz, s).toString();  //Construye el StringBuilder mientras recorre en ABB enOrden
//        return s.toString();

    } 
    
    private StringBuilder enOrden(Nodo p, StringBuilder s){
        if (p != null){
            // Lee rama izq
            s.append("left ");
            enOrden(p.getIzq(), s);
            // Escribe contenido de donde esta
            s.append("center ");
            s.append(p.getDato().toString());
            // Lee rama der
            s.append("right ");
            enOrden(p.getDer(), s);
        }
        return s;
    }
    
    public String toStringEnOrden(){
         StringBuilder s= new StringBuilder();
         enOrden(raiz, s);  //Construye el StringBuilder mientras recorre en ABB enOrden
         return s.toString();

    } 
    
    public String toStringPostOrden(){
         StringBuilder s = new StringBuilder();
         return postOrden(raiz, s).toString();  //Construye el StringBuilder mientras recorre en ABB enOrden
//         return s.toString();

    } 
    
    private StringBuilder postOrden(Nodo p, StringBuilder s){
        if (p != null){
            postOrden(p.getIzq(), s);
            postOrden(p.getDer(), s);
            s.append(p.getDato().toString());
        }
        return s;
    }
    
    public String toStringPreOrden(){
         StringBuilder s = new StringBuilder();
         return preOrden(raiz, s).toString();  //Construye el StringBuilder mientras recorre en ABB enOrden
//         return s.toString();

    } 
    
    private StringBuilder preOrden(Nodo p, StringBuilder s){
        if (p != null){
            s.append(p.getDato().toString());
            preOrden(p.getIzq(), s);
            preOrden(p.getDer(), s);
        }
        else{
            s.append("null\n");
        }
        return s;
    }
    
  
    public void put(Base e){
        raiz = insertar(raiz, e);
    }
    
    public boolean isEmpty(){
        return raiz == null;
    }
    
    //contains()
    public boolean contains(int key){
        return existe(raiz, key);
    }
    
    private boolean existe(Nodo p, int key){
        if (p == null){
            return false;
        }
        else{
            if (key == p.getDato().getKey().getNumero()){   // NO UTILIZA DIGITO VERIFICADOR
                return true;
            }
            else{
                if (key < p.getDato().getKey().getNumero()){
                    return existe(p.getIzq(), key);
                }
                else{
                    return existe(p.getDer(), key);
                }
            }
        }
    }
    
    public Nodo getMayor(Nodo p){
//        Nodo aux = p;
        if(p.getDer() != null){
            return getMayor(p.getDer());
        }
        else{
//            p = null;
            return p;
        }
    }
    
    public boolean remove(int key){
        if (this.contains(key) && !this.isEmpty()){
            eliminar(raiz, key);
            return true;
        }
        return false;
    }
    
    public Nodo eliminar(Nodo A, int key){
        Nodo p = A;
        Nodo Mayor;
        
        if (p == null){
            return null;
        }
        else{
            if (key == A.getDato().getKey().getNumero()){
                if(A.getDer() == null && A.getIzq() == null){
                    return null;
                }
                else if (A.getIzq() == null){
                    p = A.getDer();
                }
                else {
                    Mayor = getMayor(A.getIzq());                    
                    A.setDato(Mayor.getDato());
                    A.setIzq(eliminar(A.getIzq(), Mayor.getDato().getKey().getNumero()));
                    
                }
            }
            else if (key < A.getDato().getKey().getNumero()){
                A.setIzq(eliminar(A.getIzq(), key));
            }
            else{
                A.setDer(eliminar(A.getDer(), key));
            }
            return A;
        }
    }

    
    public Base get(int key){
        return obtener(raiz, key);
    }
    
    public Base obtener(Nodo p, int key){
        if (p == null){
            return null;
        }
        else{
            if (key == p.getDato().getKey().getNumero()){
                return p.getDato();
            }
            else{
                if (key < p.getDato().getKey().getNumero()){
                    return obtener(p.getIzq(), key);
                }
                else{
                    return obtener(p.getDer(), key);
                }
            }
        }
    }
    
    //Métodos auxiliares
    private Nodo insertar(Nodo p, Base e){
        if (p == null){
            p = new Nodo(e);
  //          System.out.println("Creado.. " + e.toString());
        }
        else{
            if (e.getKey().getNumero() < p.getDato().getKey().getNumero()){
  //              System.out.println("\tHijo izq de " + p.getDato().getKey().getNumero());
                p.setIzq(insertar(p.getIzq(), e));
            }
            else{
                if (e.getKey().getNumero() > p.getDato().getKey().getNumero()){
    //                System.out.println("\tHijo der de " + p.getDato().getKey().getNumero());
                    p.setDer(insertar(p.getDer(), e));
                }
                else{
    //                System.out.println("\tClave ya existe...");
                }
            }           
        }
        return p;
    }
    

    public int size(){
        return contar(raiz);
    }
    
    public int contar(Nodo p){
        if (p == null){
            return 0;
        }
        else{
            return 1 + contar(p.getIzq()) + contar(p.getDer());
        }
    }
    
    public int sumarKeys(){
        return sumar(raiz);
    }
    
    public int sumar(Nodo p){
        if (p == null){
            return 0;
        }
        else{
            return p.getDato().getKey().getNumero() + sumar(p.getIzq()) + sumar(p.getDer());  
        }
    }
         
}
