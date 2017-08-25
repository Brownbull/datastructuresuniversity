/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

import listaLinealGenerica.Lista;

/**
 *
 * @author mayor
 */
public class AppList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lista L = new Lista();
        L.add(5);
        L.add("seis");
        System.out.println(L.toString());
        
    }
    
}
