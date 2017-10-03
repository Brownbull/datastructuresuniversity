/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minimaarket;

import Clases.Stack;
import Clases.Producto;
import Clases.Queue;
import java.util.Scanner;

/**
 *
 * @author 104716482
 */
public class Minimaarket {

    /**
     * @param args the command line arguments
     */
    
    public static void procesoCompra(Stack<Producto> Canasto)
    {
        int n, cod;
        float pre;
        Scanner sf = new Scanner(System.in);
        System.out.print("Cantidad de productos : ");        
        n = sf.nextInt();
        for(int i=1; i<=n; i++)
        {
            System.out.println("Producto : "+i);
            System.out.println("   Codigo : ");
//            cod = sf.nextInt();
            cod = 10*i;
            System.out.println("   Precio : ");
//            pre = sf.nextFloat();
            pre = 1000*i;
            Producto P = new Producto(cod,pre);
            Canasto.Push(P);
        }
        System.out.println("fin de ingreso de producto");
    }
    public static float procesoPagar(Queue<Stack> C)
    {
        float monto = 0;
        int c = 0;  //contador de canastos
        while(! C.isEmpty())
        {
            Stack<Producto> S = C.remove();
            c++;
            System.out.println("\ncanasto : "+c);
            float m = 0;
            while(! S.isEmpty())
            {
                Producto P = S.Pop();
                System.out.println("Pop...");
                m = m + P.getPrecio();
                System.out.println("m = "+m);
            }
            System.out.println("Monto parcial = "+m);
            monto = monto + m;
        }
        return monto;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("MINIMARKET");
        /*
        Producto P = new Producto();
        System.out.println("P = "+P.toString());
        
        Stack<String> S = new Stack();
        S.Push("hola");
        S.Push("chao");
        System.out.println("S = "+S.toString());
        */

        Queue<Stack> Caja = new Queue();
        System.out.println("Inicializando...");
        System.out.println("Caja : "+Caja.toString());
        int m = 3;
        for(int j=1; j<=m; j++)
        {
            Stack<Producto> Canasto = new Stack();
            System.out.println("Inicializando Canasto "+j);
            procesoCompra(Canasto);
            System.out.println("Canasto = "+Canasto.toString());

            System.out.println("Agregando canasto a Caja\n");
            Caja.add(Canasto);
        }
        System.out.println("Muestra Caja : "+Caja.toString());
        
        float monto = procesoPagar(Caja);
        System.out.println("Monto Total = "+monto);
        

    }
    
}
