package aplicaciones;

import clases.Elemento;
import clases.Fecha;
import clases.Persona;
import pCola.Pcola;



/**
 * Write a description of class AppPColas here.
 * 
 * @author Nina 
 * @version 2016-1
 */
public class AppPColas
{
    public static void main(String[] args)
    {
        /*
        Pcola<Persona> pq= new Pcola<>(10);
        Elemento<Persona> e1 = new Elemento<>(new Persona(12340200,"Juan","Jara",'M','S',new Fecha(1,3,1989)),7);
        Elemento<Persona> e2 = new Elemento<>(new Persona(5678900,"Laura","Araya",'F','C',new Fecha(5,7,1988)),5);
        Elemento<Persona> e3 = new Elemento<>(new Persona(13690200,"Carolina","Contreras",'F','S',new Fecha(9,12,1995)),3);
        Elemento<Persona> e4 = new Elemento<>(new Persona(9753400,"Pedro","Soto",'M','V',new Fecha(22,4,1991)),4);
        Elemento<Persona> e5 = new Elemento<>(new Persona(9876500,"Diego","Bravo",'M','D',new Fecha(17,3,1990)),1);
        Elemento<Persona> e6 = new Elemento<>(new Persona(12543300,"Andrea","Rodriguez",'F','S',new Fecha(27,1,1990)),2);
        
        pq.add(e1);
        pq.add(e2);
        pq.add(e3);
        pq.add(e4);
        pq.add(e5);
        pq.add(e6);
 
        System.out.println("pq : "+pq.toString()); 
        
        
        Pcola<Integer> H = new Pcola<>(5);
        Elemento<Integer> g1 = new Elemento<>(1,1);
        Elemento<Integer> g2 = new Elemento<>(5,5);
        Elemento<Integer> g3 = new Elemento<>(3,3);
        Elemento<Integer> g4 = new Elemento<>(8,8);
        
        H.add(g1);
        H.add(g2);
        H.add(g3);
        H.add(g4);
        System.out.println("H : " + H.toString());
        */
        Pcola<String> F = new Pcola<>(6);
        Elemento<String> g1 = new Elemento<>("A",1);
        Elemento<String> g2 = new Elemento<>("C",3);
        Elemento<String> g3 = new Elemento<>("H",5);
        Elemento<String> g4 = new Elemento<>("R",10);
        Elemento<String> g5 = new Elemento<>("Z",20);
        
        F.add(g1);
        F.add(g2);
        F.add(g3);
        F.add(g4);
        F.add(g5);
        System.out.println("F : " + F.toString());
        
    }

}
