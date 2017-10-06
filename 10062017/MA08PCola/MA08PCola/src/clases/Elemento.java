package clases;


/**
 * Write a description of class Elemento here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Elemento<T>
{
    private int prioridad;
    private T info;
    
    public Elemento()
    {
        prioridad=1;
        info= null;
    }
    
    public Elemento(T e, int prio)
    {
        prioridad=prio;
        info= e;
    }
    
    public int getPrioridad()
    {
        return prioridad;
    }
    
    public void setPrioridad(int p)
    {
        prioridad=p;
    }
    
    public T getInfo()
    {
        return info;
    }
    
    public void setInfo(T e)
    {
        info= e;
    }
    
    public String toString()
    {
       return "Prioridad: " + prioridad + "\n" + info.toString();
    }
}
