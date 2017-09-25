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

    public Lista<T> getStack() {
        return stack;
    }

    public void setStack(Lista<T> stack) {
        this.stack = stack;
    }
    
    public Stack(){
        stack = new Lista();
    }
    
    public boolean push(T e)
    {
        stack.add(e);
        return true;
    }
    
    public T pop()
    {
        return stack.removeFirst();
    }
    
    public boolean isEmpty()
    {
        return stack==null;
    }

    @Override
    public String toString() {
        
        return stack.toString();
    }
    
    public boolean remove(T e)
    {
        Lista<T>stack2 = new Lista();
        Boolean ok=false;
        Boolean control=true;

        if (!isEmpty())
        {
            T f = pop();
            while(control)
            {
                stack2.add(f);
                f = pop();
                if (f==null)
                   control=false;
                else
                  if (f.equals(e))
                  {
                      ok=true;
                      control=false;
                  }
            }
            
            while(stack2!=null)
            {
              f=stack2.removeFirst();
              if (f!=null)
              {
                 push(f);
              }
                 if (f==null)
                     stack2=null;
             }
              return ok;
            
        }
        
        return ok;
    }
    
}
