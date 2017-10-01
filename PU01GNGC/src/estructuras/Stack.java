/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras;

/**
 *
 * @author guillermo
 */
public class Stack<T> {
    private Lista<T> stack;

    public Stack() {
        stack = new Lista();
    }
    
    public boolean Push(T e)
    {
        return (stack.addToEnd(e));
        
    }
    
    public boolean Pop(){
        return (stack.removelast());
    }
    public boolean isEmpty(){
        return (stack.isEmpty());
    }
    
    public int count(){
        return stack.count();
    }
    @Override
    public String toString() {
        return stack.toString();
    }
    
    
}
