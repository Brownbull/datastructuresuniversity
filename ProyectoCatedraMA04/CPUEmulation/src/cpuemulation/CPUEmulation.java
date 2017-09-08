/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpuemulation;

import Clases.DinamicQueue;
import Clases.Proceso;
import java.util.Scanner;

/**
 *
 * @author mayor
 */
public class CPUEmulation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Start Processes: ");
        Proceso P = new Proceso();
        System.out.println(P.toString());
        DinamicQueue<Proceso> ColaEspera = new DinamicQueue();
        DinamicQueue<Proceso> ColaTerminado = new DinamicQueue();
        
        System.out.println("Llenado Cola Espera: ");
        Proceso P1 = new Proceso("A", 12 , 1);
        Proceso P2 = new Proceso("B", 24 , 2);
        Proceso P3 = new Proceso("C", 30 , 3);
        Proceso P4 = new Proceso("D", 15 , 4);
        
        ColaEspera.add(P1);
        ColaEspera.add(P2);
        ColaEspera.add(P3);
        ColaEspera.add(P4);
        
        System.out.println(ColaEspera);
        System.out.println("Ingrese valor de T = ");
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        if (t > 0){
            while (!ColaEspera.isEmpty()){
                Proceso pr = ColaEspera.remove();
                System.out.println("pr : " + pr.toString() + "\n");
                pr.setTiempo(pr.getTiempo() - t);
                if (pr.getTiempo() > 0){
                    ColaEspera.add(pr);
                }
                else{
                    ColaTerminado.add(pr);
                }
                
            } // end of  while (!ColaEspera.isEmpty())
                
        } // end of if (t > 0)

    } // end of public static void main(String[] args)
    
} // end of public class CPUEmulation
