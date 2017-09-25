/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

import Arreglo.Lista;
import clases.Cuenta;
import java.util.Scanner;

/**
 *
 * @author mayor
 */
public class AppArreglo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner s = new Scanner(System.in);
        
        Lista<Integer> L = new Lista();
        System.out.println("¿esta vacía?");
        System.out.println(L.isEmpty());
        
        s.nextLine();
        
        System.out.println("se agregan elementos");
        
        L.add(5);
        L.add(7);
        L.add(8);
        System.out.println("¿esta vacía?");
        System.out.println(L.isEmpty());
        s.nextLine();
        System.out.println("Lo que se agregó");
        System.out.println(L.toString());
        s.nextLine();
        
        Lista<String> A =  new Lista();
        A.add ("Hola");
        A.add("chao");
        A.add("Eso");
        System.out.println("segunda lista");
        System.out.println(A.toString());
        s.nextLine();
        
        Cuenta c1 = new Cuenta("100,Estado,18676228-2,Juan Valdés Arias,120000.0,ACTIVA");
        Cuenta c2 = new Cuenta("200,Chile,1-9,Elvis Tec blando,390000.0,ACTIVA");
        Cuenta c3 = new Cuenta("300,Bci,2-7,Zoila Meza Delacasa,430000.0,ACTIVA");
        
        Lista<Cuenta> C = new Lista();
        C.add(c1);
        C.add(c2);
        C.add(c3);
        
        System.out.println("lista de cuentas");
        System.out.println(C.toString());
        s.nextLine();
        
        System.out.println("obtener el indice 1");
        System.out.println(C.get(1));
        s.nextLine();
        
        System.out.println("Creando c4");
        Cuenta c4 = new Cuenta("900,Scotiabank,2-7,Zoila Meza Delacasa,430000.0,ACTIVA");
        
  
        System.out.println("Setear el objeto 4 en 1");
        C.set(c4,1);
        System.out.println(C.toString());
        s.nextLine();
        System.out.println("obtener que hay en 1 ");
        System.out.println(C.get(1));
        s.nextLine();
        
        
        System.out.println("buscando si existe C4");
        System.out.println(C.contains(c4));
        s.nextLine();
        System.out.println("buscando si existe C2");
        System.out.println(C.contains(c2));
        s.nextLine();
        
        System.out.println("buscando el indice de c4");
        System.out.println(C.indexOf(c4));
        s.nextLine();
        
        System.out.println("seteando c2 en 1");
        C.set(c2,1);
        System.out.println(C.toString());
        s.nextLine();
        
        System.out.println("antes de remover c2");
        System.out.println(C.toString());
        
        C.remove(c2);
        System.out.println("después de remover c2");
        System.out.println(C.toString());
        
        s.nextLine();
        
        C.add(c2);
        
        System.out.println("antes de remover 0");
        System.out.println(C.toString());
        
        C.remove(0);
        
        System.out.println("después de remover 0");
        System.out.println(C.toString());
        
        s.nextLine();
        
        C.clear();
        System.out.println("limpia");
        System.out.println(C.toString());
        System.out.println(C.isEmpty());
        
        s.nextLine();
        
        C.add(c1);
        C.add(c2);
        C.add(c3);
        
        
        
        System.out.println("normal");
        System.out.println(C.toString());
        System.out.println(C.size());
        
        s.nextLine();
        
        C.insert(c4, 1);
        
        System.out.println("insertado");
        System.out.println(C.toString());
        System.out.println(C.size());
        
        s.nextLine();
        
        C.insert(c1, 1);
        System.out.println("insertado 2");
        System.out.println(C.size());
        System.out.println(C.toString());
        
        s.nextLine();
        
        C.insert(c4, 1);
        System.out.println("insertado 3");
        System.out.println(C.size());
        System.out.println(C.toString());
        
        s.nextLine();
        
        C.insert(c3,4);
        System.out.println("insertado 4");
        System.out.println(C.size());
        System.out.println(C.toString());
        
        s.nextLine();
        
        System.out.println("borrando c4");
        C.remove(c4);
        System.out.println(C.size());
        System.out.println(C.toString());
        
        s.nextLine();
        
        System.out.println("borrando c1");
        C.remove(c1);
        System.out.println(C.size());
        System.out.println(C.toString());
        
        s.nextLine();
        
        System.out.println("borrando c3");
        C.remove(c3);
        System.out.println(C.size());
        System.out.println(C.toString());
        
        s.nextLine();
        
        System.out.println("borrando c2");
        C.remove(c2);
        System.out.println(C.size());
        System.out.println(C.toString());
        
        s.nextLine();
        
    }
    
}
