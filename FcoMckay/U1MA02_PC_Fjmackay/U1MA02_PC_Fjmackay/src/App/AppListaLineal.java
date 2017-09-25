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
public class AppListaLineal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("LLS");
        Lista L = new Lista();
        L.add(5);
        L.add(7);
        L.add(8);
        System.out.println(L.toString());
        
        L.remove(5);
        System.out.println(L.toString());
        L.addLast(1);
        System.out.println(L.toString());
        
        System.out.println(L.indexOf(7));
        
        System.out.println(L.contains(8));
        
        L.set(9,1);
        System.out.println(L.toString());
        
        System.out.println(L.get(2));
        
        
    }
    
}
