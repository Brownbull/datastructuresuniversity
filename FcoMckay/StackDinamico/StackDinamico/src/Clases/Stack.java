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
        stack = new Lista();
    }
    
    public Lista<T> getStack() {
        return stack;
    }
    
    public void setStack(Lista<T> stack) {
        this.stack = stack;
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
    
    public int length(){
        Stack<T> stack2 = new Stack();
        int i = 0;
        
        if (!isEmpty()){
          T f= pop();
          while(f!=null){
              stack2.push(f);
              i++;
              f=pop();
          }
          
          f = stack2.pop();
          while(f!=null){
              push(f);
              f=stack2.pop();
          }
        }

        return i;
    }
    
    public boolean remove(T e)
    {
        Stack<T>stack2 = new Stack();
        Boolean ok=false;
        Boolean control=true;

        if (!isEmpty())
        {
            T f = pop();
            while(control)
            {
                stack2.push(f);
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
              f=stack2.pop();
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
