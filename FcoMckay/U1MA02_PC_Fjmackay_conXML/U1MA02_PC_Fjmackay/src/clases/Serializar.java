/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Vector;
import listaLinealGenerica.Lista;
import listaLinealGenerica.Nodo;

/**
 *
 * @author fjmackay
 */
public class Serializar<T> {

    public Serializar() {
    }
         
    public void serializa(Lista lista ) {
        
        try{
            
            XMLEncoder out = new XMLEncoder(new FileOutputStream("interface.xml"));
            out.writeObject(lista);
            out.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
    
    public Lista deserializa() {
        Lista lista = new Lista(); 
        try{
            XMLDecoder in = new XMLDecoder(new FileInputStream("interface.xml"));
            lista = (Lista) in.readObject();
            in.close();
        } catch (IOException e){
            e.printStackTrace();
        } finally {
           
           System.out.println("Deserializado OK");
        }
    
        return lista;
    }
            
                              
}
