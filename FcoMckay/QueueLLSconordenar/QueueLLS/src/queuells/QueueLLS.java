/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queuells;

import Clases.ColaLLS;
import Clases.Nodo;

/**
 *
 * @author mayor
 */
public class QueueLLS {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        // TODO c        ode application logic here
        
        ColaLLS cola = new ColaLLS();
        System.out.println(cola.isEmpty());
        cola.add(22);
        cola.add(4);
        cola.add(32);
        cola.add(25);
        cola.add(12);
        cola.add(15);
        cola.add(8);
        cola.add(7);
        cola.add(21);
        cola.add(1);
        cola.add(12);
        cola.add(23);
        System.out.println(cola.toString());
        
        
    //    cola.remove();
    
        ordenaint(cola);
        
        System.out.println(cola.toString());
        

        ColaLLS<String> cola2 = new ColaLLS();        
        System.out.println(cola2.isEmpty());
        cola2.add("ximena");
        cola2.add("helena");
        cola2.add("tracy");
        cola2.add("camilo");
        cola2.add("francisco");
        
        
        System.out.println(cola2.toString());
        
        System.out.println("y ahora ordenado");
        ordenastring(cola2);
        
        System.out.println(cola2.toString());
        
        

    }
     
    public static int largo(ColaLLS cola)
    { 
        int i=0;
        
        ColaLLS temp = new ColaLLS();
        
        while(!cola.isEmpty())
        {
            temp.add(cola.remove());
            i++;
        }
        
        while(!temp.isEmpty())
            cola.add(temp.remove());
        
        return i;
    }
    
    public static void ordenaint(ColaLLS<Integer> cola)
    {
        int e,f=0;
        
        int l= largo(cola);

        ColaLLS<Integer> temp = new ColaLLS();
        
        for (int i = 0; i < l; i++) {
            e=cola.remove();
            while(!cola.isEmpty())
            {
               f=cola.remove();
               if (e>f)
                 temp.add(f);
               else
               {
                   temp.add(e);
                   e=f;
                }
  
               }
        
               temp.add(e);
        
               while(!temp.isEmpty()){
                   e=temp.remove();
                   cola.add(e);
               }
        }
        
    }
    
    public static void ordenastring(ColaLLS<String> cola)
    {
        String e,f="";
        
        int l= largo(cola);

        ColaLLS<String> temp = new ColaLLS();
        
        for (int i = 0; i < l; i++) {
            e=cola.remove();
            while(!cola.isEmpty())
            {
               f=cola.remove();
               if (e.compareTo(f)>0)
                 temp.add(f);
               else
               {
                   temp.add(e);
                   e=f;
                }
  
            }
        
            temp.add(e);
        
            while(!temp.isEmpty()){
               e=temp.remove();
               cola.add(e);
             }
         }
        
    }
    
}
