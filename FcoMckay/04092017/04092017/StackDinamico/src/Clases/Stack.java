/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author 122639207
 */
public class Stack<T> {
    private Lista<T> stack;
    
    public Stack(){
        stack=null;
    }
    
    public boolean push(T e)
    {
        stack.add(e);
        return true;
    }
    
    public T pop()
    {
        
    }
    
    public boolean isEmpty()
    {
        return stack==null;
    }
    
}
