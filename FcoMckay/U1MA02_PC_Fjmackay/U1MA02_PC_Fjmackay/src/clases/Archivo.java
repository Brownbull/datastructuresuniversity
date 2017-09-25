/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Vector;

import listaLinealGenerica.Lista;
import listaLinealGenerica.Nodo;

/**
 *
 * @author fjmackay
 */
public class Archivo {
    
    public Archivo()
    {
    }
    
    public boolean Serializar(Lista<Postulante> lista)
    {
        FileOutputStream fos = null;
        ObjectOutputStream salida = null;
       
        Nodo p;
        p=lista.getLista();
        Vector vector = new Vector();
        while(p!=null)
        {
            Postulante po=(Postulante) p.getInfo();
            vector.add(po);
            p=p.getLink();
        }   
        
              
      //  Empleado emp;
        try {
            fos = new FileOutputStream("lista.dat");
            salida = new ObjectOutputStream(fos);
            salida.writeObject(vector);
           
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } finally {
            try {
                if(fos!=null) fos.close();
                if(salida!=null) salida.close();
                return true;
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
          return false;
    }
    
    public Lista Deserializar()
    {
        Lista lista = new Lista(); 
        Vector vector = new Vector();
        Postulante postu;
       
        FileInputStream fis = null;
        ObjectInputStream entrada = null;
        try {
            fis = new FileInputStream("lista.dat");
            entrada = new ObjectInputStream(fis);
            vector = (Vector)entrada.readObject();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
                if (entrada != null) {
                    entrada.close();
                }
                
                int j = vector.size();
                for (int i=0; i<j; i++)
                {
                     postu = (Postulante)vector.get(i);
                     lista.addLast(postu);
                }
                
                System.out.println("Deserializado OK");
                
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }        
        
        
        
        return lista;
    }
}
