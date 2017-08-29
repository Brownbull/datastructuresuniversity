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
        L.addToStart(5);
        L.addToEnd("seis");
        System.out.println(L.toString());
        System.out.println(L.buscar(5));
        System.out.println(L.buscar("wea"));
        System.out.println(L.buscar("seis"));
       // L.remove("seis");
        System.out.println(L.toString());
    }
    
}
