/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author 104716482
 */
public class Stack<T> {
    private Lista<T> stack;

    public Stack() {
        stack = new Lista<T>();
    }
    
    public boolean Push(T e)
    {
        stack.add(e);
        return true;
    }
    
    //tarea POP
    public T Pop()
    {
        return stack.remove();
    }
    
    public boolean isEmpty()
    {
        return stack.isEmpty();
    }
    @Override
    public String toString()
    {
        return stack.toString();
    }
    
    
}
