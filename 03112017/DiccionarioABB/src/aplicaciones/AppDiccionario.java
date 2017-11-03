/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicaciones;

import clases.Base;
import clases.Diccionario;
import utiles.Persona;
import utiles.Rut;

/**
 *
 * @author 85605410
 */
public class AppDiccionario {
        public static void main(String[] args){
            Persona p1= new Persona("11334056,José,Álvarez,M,C,21/10/1971");
            Persona p2= new Persona("13240011,Esteban,Quito,M,S,2/5/1978");
            Persona p3= new Persona("12345678,Pedro,Jara,M,C,12/3/1880");
            Persona p4= new Persona("10987654,Josefina,Latorre,F,S,3/8/1978");
            Persona p5= new Persona("14876543,Hugo,Boss,M,C,25/12/1983");
            Persona p6= new Persona("16897456,Maria,Pereira,F,V,2/11/1989");
            Persona p7= new Persona("11456789,Andrea,Gómez,F,C,13/3/1979");
            Persona p8= new Persona("11987654,Juan,Lopez,M,V,6/6/1976");
           
            Persona p55= new Persona("14876543,Hugo,Boss,M,C,25/12/1983");
            
            Persona p9= new Persona("12876543,Jenny,Fuentes,F,S,15/5/1978");
            Persona p10= new Persona("15455739,Ema,Tomma,F,C,12/5/1980");

            Diccionario d= new Diccionario();
                        
            d.put(new Base<Persona>(p1.getRut(), p1));
            d.put(new Base<Persona>(p2.getRut(), p2));
            d.put(new Base<Persona>(p3.getRut(), p3));
            d.put(new Base<Persona>(p4.getRut(), p4));
            d.put(new Base<Persona>(p5.getRut(), p5));
            d.put(new Base<Persona>(p6.getRut(), p6));
            d.put(new Base<Persona>(p7.getRut(), p7));
            d.put(new Base<Persona>(p8.getRut(), p8));
            
            d.put(new Base<Persona>(p55.getRut(), p55));
            
            d.put(new Base<Persona>(p9.getRut(), p9));
            d.put(new Base<Persona>(p10.getRut(), p10));
            
            System.out.println("\nNÓMINA");
            System.out.println(d.toString());
            
            System.out.println("\nBuscando datos Rut:");
            Rut r= new Rut(16897456);
            
            Base<Persona> p= d.get(r);
            if (p!=null){
                System.out.println(p.toString());
            }
            else{
                System.out.println(r.toString() + " No existe");
            }
            
            System.out.println("\nBuscando datos Rut:");
            
            r= new Rut(79733720);
            p= d.get(r);
            if (p!=null){
                System.out.println(p.toString());
            }
            else{
                System.out.println(r.toString() + " No existe");
            }
            
        }
}
