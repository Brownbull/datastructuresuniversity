/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

import Arreglo.Lista;
import clases.Cuenta;

/**
 *
 * @author mayor
 */
public class AppArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lista L = new Lista();
        L.add(5);
        L.add(6);
        L.add("siete");
        System.out.println(L.toString());
        
        Lista A = new Lista();
        A.add("Hola");
        A.add("Mundo");
        System.out.println(A.toString());
        
        Cuenta c1 = new Cuenta();
        Cuenta c2 = new Cuenta();
        Cuenta c3 = new Cuenta();
        
        Lista<Cuenta> Cuentas = new Lista();
        Cuentas.add(c1);
        Cuentas.add(c2);
        Cuentas.add(c3);
        System.out.println(Cuentas.toString());
        
        
        
        
        
        
    } //  end of public static void main(String[] args)    
} // end of public class AppArray 
