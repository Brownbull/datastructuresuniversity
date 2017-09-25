/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma01pc;

import clases.Cuenta;

/**
 *
 * @author 122639207
 */
public class MA01PC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Inicio de programa");
        Cuenta C = new Cuenta();
        System.out.println("Nombre = "+C.getNomBanco());
        
        Cuenta D = new Cuenta("245003,Banco de Chile,12263920,Perico,Palotes,Paloso,23500.33");
    
        System.out.println("Cuenta = "+D.getNumCuenta());
        System.out.println("Nombre = "+D.getNomBanco());
        System.out.println("Nombre = "+D.getRut());
        System.out.println("Cliente = "+D.getCliente());
        System.out.println("Saldo ="+D.getSaldo());
        
        System.out.println(" ");
        System.out.println(D.toString());
    }
    
}
