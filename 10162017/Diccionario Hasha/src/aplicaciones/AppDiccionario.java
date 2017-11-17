package aplicaciones;


import utiles.Fecha;
import utiles.Persona;
import clases.Elemento;
import utiles.Rut;


/**
 * Write a description of class AppDiccionario here.
 * 
 * @author NVA 
 * @version 2016
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
        
     }
}
