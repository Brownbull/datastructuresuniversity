/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma01pp;

import clases.Producto;

/**
 *
 * @author 172493726
 */
public class MA01PP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Producto p = new Producto();
        System.out.println(p.toString());
        Producto p1 = new Producto("123,colacao,05/06/2989,23,23,5");
        System.out.println("p1: " + p1.toString());
        
        Producto p2 = new Producto(p1);
        System.out.println("p2: " + p2.toString());
        p1.toSave("datos.txt");
        p2.toSave("datos.txt");
    }
    
}
