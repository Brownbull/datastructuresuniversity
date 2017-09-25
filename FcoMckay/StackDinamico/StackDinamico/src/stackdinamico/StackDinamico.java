/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackdinamico;

import Clases.Stack;

/**
 *
 * @author 122639207
 */
public class StackDinamico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Stack test = new Stack();
        test.push(3);
        test.push(2);
        test.push(1);
        test.push(5);
        test.push(4);
        
        //test.remove(3);
        //test.remove(9);
        
        System.out.println(test.toString());
        System.out.println("y ahora ordenado");
        ordenaint(test);
        System.out.println(test.toString());
        
        Stack<String> test2 = new Stack();
        
        test2.push("prueba");
        test2.push("desorden");
        test2.push("anti");
        test2.push("materia");
        test2.push("burra");
        
        System.out.println(test2.toString());
        System.out.println("y ahora ordenado");
        ordenastring(test2);
        System.out.println(test2.toString());
        
    }
    
        
    public static void ordenaint(Stack<Integer> st)
    {
        int e,f=0;
        int l= st.length();

        Stack<Integer> temp = new Stack();
        
        for (int i = 0; i < l; i++) {
            e=st.pop();
            while(st.length()>0)
            {
               f=st.pop();
               if (e>f)
               {
                   temp.push(f);
               }
               else
               {
                   temp.push(e);
                   e=f;
                }
  
            }
        
            temp.push(e);
            
            
            while(temp.length()>0){
               e=temp.pop();
               st.push(e);
            }
        }
        
    } 
    
    public static void ordenastring(Stack<String> st)
    {
        String e,f="";
        int l= st.length();

        Stack<String> temp = new Stack();
        
        for (int i = 0; i < l; i++) {
            e=st.pop();
            while(st.length()>0)
            {
               f=st.pop();
               if (e.compareTo(f)>0)
               {
                   temp.push(f);
               }
               else
               {
                   temp.push(e);
                   e=f;
                }
  
            }
        
            temp.push(e);
            
            
            while(temp.length()>0){
               e=temp.pop();
               st.push(e);
            }
        }
        
    }
    
}
