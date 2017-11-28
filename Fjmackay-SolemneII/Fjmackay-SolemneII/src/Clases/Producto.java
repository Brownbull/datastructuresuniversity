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
public class Producto {
    private int codigo;
    private String nombre;
    private int stock;

    // Constructor por defecto
    public Producto() {
        this.codigo=0;
        this.nombre="";
        this.stock=0;
    }

    // Constructor por parámetro
    public Producto(int cod, String nom, int st) {
        this.codigo = cod;
        this.nombre = nom;
        this.stock = st;
    }
    
    //Constructor por string
    public Producto(String s) {
        String[] c = s.split(",");
        this.codigo=Integer.parseInt(c[0]);
        this.nombre=c[1];
        this.stock=Integer.parseInt(c[2]);
    }
    
    //Constructor por copia
    public Producto(Producto p) {
        this.codigo = p.codigo;
        this.nombre = p.nombre;
        this.stock = p.stock;
    }
    
    // Consultores y modificadores

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    //Sobreescritura de toString
    
    @Override
    public String toString() {
        return "Producto{" + "codigo=" + codigo + ", nombre=" + nombre + ", stock=" + stock + '}';
    }
    
    
    
}
