package aplicaciones;

import clases.Diccionario;
import utiles.Fecha;
import utiles.Persona;
import clases.Elemento;
import utiles.Rut;


/**
 * Write a description of class AppDiccionario here.
 * 
 * @author NVA 
 * @version 
 */
public class AppDiccionario{

     public static void main(String[] args){
        Persona p1 = new Persona (11122333, "Ana Maria","Jara",'F','C', new Fecha(12,8,1975));
        Persona p2 = new Persona (12244775 , "Juan Jose","Lara" , 'M','S',new Fecha(5,5,1970));
        Persona p3 = new Persona (4355883 , "Luis Alberto","Figueroa" , 'M','V' , new Fecha(21,10,1944));
        Persona p4 = new Persona (14433999, "Nancy ","Sanchez" , 'F' ,'C', new Fecha(18,11,1996));
        Persona p5 = new Persona (15566222 , "Lorena","Abarca" , 'F','D', new Fecha(4,12,1985));
        Persona p6 = new Persona (12699555 , "Manuel Montti","Rojas" , 'M','C' , new Fecha(10,5,1981));
        Persona p7 = new Persona (17766224 , "Jorge Andres","Lopez" , 'M','S' , new Fecha(22,6,1987));
        Persona p8 = new Persona (8899222 , "Luz Maria","Herrera" , 'F','S' , new Fecha(1965));
        
        Elemento<Persona> e= new Elemento<>();
        
        
        Diccionario<Persona> d= new Diccionario<>(50);
        
        e= new Elemento<>(p1.getRut().toString(), p1);
        d.put(e); 
        
        d.put(new Elemento<>(p2.getRut().toString(),p2));
        d.put(new Elemento<>(p5.getRut().toString(),p5));
        d.put(new Elemento<>(p8.getRut().toString(),p8));
        d.put(new Elemento<>(p3.getRut().toString(),p3));
        d.put(new Elemento<>(p7.getRut().toString(),p7));
        d.put(new Elemento<>(p4.getRut().toString(),p4));
        d.put(new Elemento<>(p6.getRut().toString(),p6));
        
        System.out.println(d.toString());
        
        if (d.containsKey(p5.getRut().toString())){
            System.out.println(p5.getRut().toString()+ " existe en el diccionario");
        }
        
        Rut r= new Rut("79733720-K");
        if (d.containsKey(r.toString())){
            System.out.println(r.toString()+ " existe en el diccionario");
        }
        else{
            System.out.println(r.toString()+ " NO existe en el diccionario");
        }
        
        d.put(new Elemento<>(r.toString(),new Persona(r)));
        
        if (d.containsKey(r.toString())){
            System.out.println(r.toString()+ " existe en el diccionario");
        }
        else{
            System.out.println(r.toString()+ " NO existe en el diccionario");
        }
        
        Persona persona= d.remove(p7.getRut().toString());
        System.out.println("\nTodo el diccionario: \n" +d.toString());
     }
     
}
