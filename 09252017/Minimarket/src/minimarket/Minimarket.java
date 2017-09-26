/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minimarket;

import Clases.DinamicQueue;
import Clases.Producto;
import java.util.Scanner;
import Clases.DinamicStack;

/**
 *
 * @author 172493726
 */
public class Minimarket {

    /**
     * @param args the command line arguments
     */
    public static void Compra (DinamicStack<Producto> Canasto){
        System.out.println("Cantidad de productos :");
        Scanner sf = new Scanner(System.in);
        int Cantidad = sf.nextInt();
        int Codigo;
        float Precio;
        
        for(int i = 1; i <= Cantidad; i++){
            System.out.println("Producto :" + i);
            System.out.println("Codigo :");
            Codigo = sf.nextInt();
            System.out.println("Precio :");
            Precio = sf.nextFloat();
            Producto P = new Producto(Codigo, Precio);
            Canasto.Push(P);
        }        
    }
    
    public static float Pagar (DinamicQueue<DinamicStack> C){
        float monto = 0;
        while(!C.isEmpty()){
            DinamicStack<Producto> S = C.remove();
            float m = 0;
            while(!S.isEmpty()){
                Producto P = S.Pop();
                m = m + P.getPrecio();
            }
            monto = monto + m;
        }
            
        
        return 0;      
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("MINIMARKET");
        Producto P = new Producto();
        System.out.println("P = " + P.toString());
        
        /*
        Stack<String> S = new Stack();
        S.push(P.toString());
        System.out.println("S = " + S.toString());
        */
        
        
        //System.out.println("Canasto:");
        //System.out.println(Canasto.toString());
        
        DinamicQueue<DinamicStack> Caja = new DinamicQueue();
        System.out.println("Caja:");
        int m = 3;
        for(int j = 1; j <= m; j++){
            DinamicStack<Producto> Canasto = new DinamicStack();
            Compra(Canasto);
            Caja.add(Canasto);
        }
        System.out.println(Caja.toString());
        
        float monto = Pagar(Caja);
        
    } // end of public static void main(String[] args)
    
} // end of public class Minimarket
