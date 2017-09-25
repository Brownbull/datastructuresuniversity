/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

import clases.Postulante;
import java.util.Scanner;
import listaLinealGenerica.Lista;
import utiles.Nombre;
import utiles.Rut;

/**
 *
 * @author 122639207
 */
public class AppPostulante {

    /**
     * @param args the command line arguments
     */

    
    public static void main(String[] args) {
        
        Lista<Postulante> lista=new Lista();
        
        String opcion="";
        Scanner sc=new Scanner(System.in);
        while(!"3".equals(opcion))
        {
            System.out.println("Ingrese el número de opción ");
            System.out.println("1  Ingrese postulante a la lista ");
            System.out.println("2  Liste los postulantes ");
            System.out.println("3  Salir");
            opcion=sc.nextLine();
            if ("1".equals(opcion))
            {
                ingreso(lista);
            }
            if("2".equals(opcion))
            {
                listaPostulantes(lista);
            }
        }
        // TODO code application logic here
    }
    
    public static void ingreso(Lista lista)
    {

        Postulante postu = new Postulante();        
        Scanner sc=new Scanner(System.in);
        String lectura;
        Boolean nook=true;
        int r;
        
        while (nook) 
        {
           System.out.println("Ingrese el rut del postulante sin guión y dígito ");
           lectura="";
           lectura=sc.nextLine();
           try
           {
               r=Integer.parseInt(lectura);
               postu.setRut(new Rut(r));
               nook=false;
           }
           catch (NumberFormatException e){
              nook=true;
           }
        }
        
        nook=true;
        
        while (nook) 
        {
           System.out.println("Ingrese el primer nombre y dos apellidos ");
           lectura="";
           lectura=sc.nextLine();
           
           if (!("".equals(lectura)))
           {
               postu.setNombre(new Nombre(lectura));
               nook=false;
           }
        }
        
        nook=true;
        
        while (nook)
        {
           System.out.println("Ingrese el cargo a que postula ");
           lectura="";
           lectura=sc.nextLine();
           
           if (!("".equals(lectura)))
           {
               postu.setCargo(lectura);
               nook=false;
           }
        }

        lista.addLast(postu);
        
    }
    
    public static void listaPostulantes(Lista lista)
    {
        System.out.println("La lista de postulantes es ");
        System.out.println(lista.toString());
    }
    
    
}
