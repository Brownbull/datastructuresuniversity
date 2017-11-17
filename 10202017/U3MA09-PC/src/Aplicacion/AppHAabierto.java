/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplicacion;

import clases.Base;
import clases.Diccionario;
import utiles.Fecha;
import utiles.Persona;

/**
 *
 * @author mayor
 */
public class AppHAabierto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona p1 = new Persona (11122333, "Ana Maria","Jara",'F','C', new Fecha(12,8,1975));
        Persona p2 = new Persona (12244775 , "Juan Jose","Lara" , 'M','S',new Fecha(5,5,1970));
        Persona p3 = new Persona (4355883 , "Luis Alberto","Figueroa" , 'M','V' , new Fecha(21,10,1944));
        Persona p4 = new Persona (14433999, "Nancy ","Sanchez" , 'F' ,'C', new Fecha(18,11,1996));
        Persona p5 = new Persona (15566222 , "Lorena","Abarca" , 'F','D', new Fecha(4,12,1985));
        Persona p6 = new Persona (12699555 , "Manuel Montti","Rojas" , 'M','C' , new Fecha(10,5,1981));
        Persona p7 = new Persona (17766224 , "Jorge Andres","Lopez" , 'M','S' , new Fecha(22,6,1987));
        Persona p8 = new Persona (8899222 , "Luz Maria","Herrera" , 'F','S' , new Fecha(1965));
        
        Base<Persona> b1 = new Base<>(12,p1);
        Base<Persona> b2 = new Base<>(34,p2);
        Base<Persona> b3 = new Base<>(56,p3);
        Base<Persona> b4 = new Base<>(76,p4);
        Base<Persona> b5 = new Base<>(44,p5);
        
        Diccionario<Persona> d = new Diccionario<>();
        d.put(12, p1);
        d.put(34, p2);
        d.put(56, p3);
        d.put(76, p4);
//        d.put(44, p5);
        d.put(b5);
        System.out.println("d :\n"+d.toString());
    }
    
}
