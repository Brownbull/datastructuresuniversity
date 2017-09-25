/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author gordito
 */
public class Manejadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    public Manejadora() {
    }
    
    
    public String LeerStack(Stack a)
    {
        Stack temporal = new Stack();
        StringBuilder sc = new StringBuilder();
        
        Correo correo = (Correo) a.pop();
        while(correo!=null)
        {
            sc.append(correo.toString());
            sc.append("\n");
            temporal.push(correo);
            correo=(Correo) a.pop();
        }
        
        correo = (Correo) temporal.pop();
        
        while(correo!=null)
        {
            a.push(correo);
            correo=(Correo) temporal.pop();
        }

        return sc.toString();
    }
    
    public String LeerCorreo(Stack a)
    {
        Correo correo = (Correo) a.pop();
        return correo.toString();
    }
    
    public String Traspasa(Stack a, String t)
    {
        Correo correo = new Correo(t);
        a.push(correo);
        correo=null;
        return a.toString();
    }
    
    
}
