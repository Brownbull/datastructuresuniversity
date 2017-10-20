package aplicaciones;

import clases.Elemento;
import clases.Programa;
import java.util.Scanner;
import pCola.Pcola;



/**
 * Write a description of class ProgramacionTV here.
 * 
 * @author Nina 
 * @version 2016-1
 */
public class ProgramacionTV
{
    public static void main(String[] args)
    {
        Pcola<Programa> ProgramacionTV = new Pcola();
        int preference = 0;
        int option = 1;
        
        System.out.println("Programacion TV");
        while(option != 3){
            System.out.println("Menu: Favor ingrese su opcion");
            System.out.println("1 Agregar Elementos a Programacion TV");
            System.out.println("2 Mostrar Programacion TV");
            System.out.println("3 Salir");
            Scanner sc = new Scanner(System.in);
            option = sc.nextInt();
            switch(option){
                case 1: 
                    System.out.println("Agregar Elementos a Programacion TV: ");
                    System.out.println("Cuantos elementos desea ingresar?");
                    int qty = sc.nextInt();
                    
                    for(int i = 1;i<= qty; i++){
                        System.out.println("Ingrese datos del programa como sigue:");
                        System.out.println("Nombre,area,tipo,minutos");
                        System.out.println("EJE:It,Terror,Pelicula,2");
                        sc.nextLine();
                        String informacion = sc.nextLine();
                        System.out.println("Ingrese cantidad de preferencias (prioridad)");
                        preference = sc.nextInt();
                        ProgramacionTV.add(new Elemento<>(new Programa(informacion),preference));
                    }
                    break;
                case 2: 
                    System.out.println("ElMostrar Programacion TV: ");
                    while(!ProgramacionTV.isEmpty()){
                        System.out.print(ProgramacionTV.remove().toString());
                    }
                    System.out.println("Y a dormir...");
                    break;
                case 0: 
                    System.out.println("Fin del Programa");
                    System.exit(0);
            }
            
            
        }
        
        
  
       
        
    }

}
