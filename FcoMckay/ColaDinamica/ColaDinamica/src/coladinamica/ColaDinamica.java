/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coladinamica;

import Clases.Queue;

/**
 *
 * @author mayor
 */
public class ColaDinamica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Clase Cola");
        Queue C = new Queue();
        C.add(1);
        C.add(2);
        C.add(3);
        System.out.println("C = "+C.toString());
        System.out.println("Removiendo...");
        System.out.println("e = "+C.remove());
        System.out.println("C = "+C.toString());
        
        System.out.println("\nOtra Cola R");
        Queue<String> R = new Queue();
        System.out.println("R = "+R.toString());
        R.add("Casa");
        R.add("Edificio");
        R.add("Depto");
        System.out.println("R = "+R.toString());
        System.out.println("Es vacia: "+R.isEmpty());
    }
    
}
