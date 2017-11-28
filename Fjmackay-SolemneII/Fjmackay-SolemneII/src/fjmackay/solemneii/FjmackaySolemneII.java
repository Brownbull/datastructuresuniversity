/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fjmackay.solemneii;

import Clases.Producto;
import HashAbierto.Base;
import HashAbierto.Diccionario;
import Heap.Elemento;
import Heap.Pcola;

/**
 *
 * @author 122639207
 */
public class FjmackaySolemneII {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Respuesta a pregunta 1-a
        
        Pcola<Producto> H= new Pcola<>(7);
         
        Producto p1 = new Producto(116,"Clavos",1975);
        Producto p2 = new Producto(2,"Tuercas",850);
        Producto p3 = new Producto(63,"Alambre",3000);
        Producto p4 = new Producto(27,"Pernos",330);
        Producto p5 = new Producto(103,"Cemento",120);
        Producto p6 = new Producto(28,"Atornillador",32);
        
        Elemento<Producto> e1 = new Elemento<>(p1,p1.getCodigo());
        Elemento<Producto> e2 = new Elemento<>(p2,p2.getCodigo());
        Elemento<Producto> e3 = new Elemento<>(p3,p3.getCodigo());
        Elemento<Producto> e4 = new Elemento<>(p4,p4.getCodigo());
        Elemento<Producto> e5 = new Elemento<>(p5,p5.getCodigo());
        Elemento<Producto> e6 = new Elemento<>(p6,p6.getCodigo());
        
        H.add(e1);
        H.add(e2);
        H.add(e3);
        H.add(e4);
        H.add(e5);
        H.add(e6);
       

        System.out.println("Respuestas punto 1");
        System.out.println("");
       
        // Respuesta a pregunta 1-b
        
        System.out.println("El Producto con mayor cantidad es "+MasCantidad(H));
        
        //Respuesta a pregunta 1-c
        
        System.out.println("Los productos que empiezan con A suman en stock "+SumaProductos(H,"A"));
        System.out.println("Los productos que empiezan con T suman en stock "+SumaProductos(H,"T"));
        
        System.out.println("");
        System.out.println("");
        
        // Parte 2 de la prueba
        
        System.out.println("Respuestas punto 2");
        
        // Respuesta 2-a
        Diccionario d= new Diccionario<>(10);
        
        Base<Producto> b1 = new Base(p1.getCodigo(),p1);
        Base<Producto> b2 = new Base(p2.getCodigo(),p2);
        Base<Producto> b3 = new Base(p3.getCodigo(),p3);
        Base<Producto> b4 = new Base(p4.getCodigo(),p4);
        Base<Producto> b5 = new Base(p5.getCodigo(),p5);
        Base<Producto> b6 = new Base(p6.getCodigo(),p6);
        
        d.put(b1);
        d.put(b2);
        d.put(b3);
        d.put(b4);
        d.put(b5);
        d.put(b6);
        
        // Respuesta 2-b
        
        System.out.println("La cantidad de productos almacenados en D es "+ Contar(d));
        
        // Respuesta 2-c
        
        System.out.println("El índice con más productos es "+MayorCantidad(d));
   
    }
    
    // Función pregunta 1-b
    
    public static String MasCantidad(Pcola H){
        // String vacío de respuesta
        String nombre="";
        // Variable para almacenar la cantidad
        int mascan=-1;
        
        //Cola temporal para no destruir la original
        Pcola<Producto> Temp= new Pcola<>(7);
        
        //Mientras no se vacíe el heap        
        while(!H.isEmpty()){
            //Obtiene el elemento a través del remove del heap
            Elemento el =H.remove();
            // Añade el elemento a otro heap
            Temp.add(el);
            // Genera un producto en base a la info del elemento obtenido
            Producto p = (Producto) el.getInfo();
            // Si la variable que almacena la cantidad mayor es menor al
            // stock del producto obtenido
            if (mascan<p.getStock()){
                // Cambia la variable por el stock de ese producto
                mascan=p.getStock();
                // Almacena en nombre el nombre de ese producto
                nombre=p.getNombre();
            }
            
        }
         
        // Mientras el heap temporal no esté vacío
        while(!Temp.isEmpty()){
            // Obtiene el elemento por remove del heap temporal
            Elemento e = Temp.remove();
            // Lo reañade al heap principal para no destruirlo
            H.add(e);
        }
        
        // Retornar el nombre del producto obtenido
        return nombre;
    }
    
    // Función 1-c
    
    public static int SumaProductos(Pcola H , String l){
        // Contador de resultado de la suma de todos los stocks
        int res=0;
        // Crea un heap temp para no perder el principal
        Pcola<Producto> Temp= new Pcola<>(7);
        
        // Extrae el primer caracter de la letra recibida como string
        char l1 = l.charAt(0);
        
        // Mientras el heap no esté vacío
        while(!H.isEmpty()){
            // Extrae vía remove el elemento del heap
            Elemento el =H.remove();
            // Añade el elemento al temporal
            Temp.add(el);
            // Obtiene el producto en base a la info del elemento obtenido
            Producto p = (Producto) el.getInfo();
            // Extrae la primera letra del nombre del producto
            char lp = p.getNombre().charAt(0);
            // si las letras son iguales
            if (l1==lp)
                // Añade el stock de ese producto al acumulador res
               res= res+p.getStock();
        }
        
        // Mientras el heap temporal no esté vacío
        while(!Temp.isEmpty()){
            // Obtiene el elemento desde el remove del temporal
            Elemento e = Temp.remove();
            // Añade el elemento al heap principal para reconstruirlo
            H.add(e);
        }
        
        return res;
    }
           
    // Función Contar(D) del punto 2-b
    
    public static int Contar(Diccionario D){
        // Invoca y devuelve la función contar del diccionario
        // usando el diccionario D recibido como parámetro
        return D.Contar();
    }
   
    // Función MayorCantidad del punto 2-c
    
    public static int MayorCantidad(Diccionario D){
        // Invoca y devuelve la función MayorCantidad del diccionario
        // usando el diccionario D recibido como parámetro
        return D.MayorCantidad();
    }
    
}
