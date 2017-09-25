/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simuladorcpu;

import Clases.Proceso;
import Clases.Queue;
import java.util.Scanner;

/**
 *
 * @author mayor
 */
public class SimuladorCPU {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("inicio");
        Queue<Proceso> colaEspera = new Queue();
        Queue<Proceso> colaTerminado = new Queue();
        
        System.out.println("Llenando cola espera");
        Proceso p1 = new Proceso("A",24,4);
        Proceso p2 = new Proceso("B",4,5);
        Proceso p3 = new Proceso("C",6,6);
        Proceso p4 = new Proceso("D",5,7);
        colaEspera.add(p1);
        colaEspera.add(p2);
        colaEspera.add(p3);
        colaEspera.add(p4);
        
        
        System.out.println("CE : "+colaEspera.toString());
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese t= ");
        int t = sc.nextInt();
        
        if (t>0)
        {
            while(!colaEspera.isEmpty())
            {
               Proceso pr = colaEspera.remove();
                System.out.println("pr :"+pr.toString());
                pr.setTiempo(pr.getTiempo()-t);
                if(pr.getTiempo()>0)
                    colaEspera.add(pr);
                else
                {
                    pr.setTiempo(0);
                    colaTerminado.add(pr);
                }
            }
        }
        
        System.out.println("CT: "+colaTerminado.toString());
    }
    
    
}
