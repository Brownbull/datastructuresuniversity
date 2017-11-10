/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;
/**
 * Pendiente:  K: Clave de tipo genérico.....
 * Clave: Rut
 * @author 85605410
 */
public class Base{
    private int key;  
    private int info;

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public int getInfo() {
        return info;
    }

    public void setInfo(int info) {
        this.info = info;
    }
     
    public Base() {
        this.key = 0;
        this.info = 0;
    }
    
    public Base(int key, int info) {
        this.key = key;
        this.info = info;
    }
    
    @Override
    public String toString(){
        StringBuilder s = new StringBuilder(); 
        s.append("key: ");
        s.append(Integer.toString(this.getKey()));
        s.append("info: ");
        s.append(Integer.toString(this.getInfo()));
        s.append("\n");
        return s.toString();
    }

}
