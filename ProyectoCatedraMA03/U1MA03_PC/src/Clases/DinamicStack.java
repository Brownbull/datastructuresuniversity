/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author 172493726
 */
public class DinamicStack<T> {
    private Lista<T> stack;
    
    public DinamicStack(){
        stack = new Lista<T>();
    }
    
    public boolean Push(T e){
        stack.addToEnd(e);
        return true;
    }            

    @Override
    public String toString() {
        return stack.toString();
    }
    

} // end of public class DinamicStack<T>
