/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queuells;

import Clases.ColaLLS;

/**
 *
 * @author mayor
 */
public class QueueLLS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO c        ode application logic here
        
        ColaLLS cola = new ColaLLS();
        System.out.println(cola.isEmpty());
        cola.add(1);
        cola.add(2);
        cola.add(3);
        System.out.println(cola.toString());
        
        cola.remove();
        System.out.println(cola.toString());

    }
    
}
