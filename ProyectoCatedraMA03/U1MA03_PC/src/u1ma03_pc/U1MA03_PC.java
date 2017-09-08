/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package u1ma03_pc;

import Clases.DinamicQueue;
import Clases.DinamicStack;
import Clases.StaticStack;



/**
 *
 * @author 172493726
 */
public class U1MA03_PC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Stack Estatico");
        System.out.println("Inicializacion:");
        StaticStack s = new StaticStack();
        System.out.println(s.toString());
        s.push("5");
        s.push("6");
        s.push("7");
        System.out.println(s.toString());
        System.out.println(s.pop().toString());
        System.out.println(s.toString());
        System.out.println(s.isEmpty());
        while(!s.isEmpty()){
            s.pop();
        }        
        System.out.println(s.toString());
        System.out.println(s.isEmpty());
        
        System.out.println("Stack de Strings");
        StaticStack<String> R = new StaticStack();
        R.push("wena ");
        R.push("shoro ");
        R.push("pelao");
        System.out.println(R.toString());
        
        System.out.println("Stack Dinamico");
        DinamicStack D = new DinamicStack();
        D.Push(1);
        D.Push(2);
        D.Push(3);
        D.Push(4);
        System.out.println(D.toString());
        System.out.println(D.contar());
        D.Pop();
        System.out.println(D.toString());
        System.out.println(D.contar());
        D.Pop();
        System.out.println(D.toString());
        System.out.println(D.contar());
        D.Pop();
        System.out.println(D.toString());
        System.out.println(D.contar());
        D.Pop();
        System.out.println(D.toString());
        System.out.println(D.contar());
        
        System.out.println("Clase Cola");
        DinamicQueue C = new DinamicQueue();
        C.add("un");
        C.add("dos");
        C.add("tres");
        System.out.println(C.toString());
        System.out.println(C.remove());
        System.out.println(C.toString());
        
        
        
    } // end of public static void main(String[] args)
    
}
