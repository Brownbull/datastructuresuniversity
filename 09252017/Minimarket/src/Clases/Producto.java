/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author 172493726
 */
public class Producto {
    private int codigo;
    private float precio;

    public Producto() {
        this.codigo = 0;
        this.precio = 0;
    }
    
    public Producto(int codigo, float precio) {
        this.codigo = codigo;
        this.precio = precio;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    @Override
    public String toString() {
        return "codigo=" + codigo + ", precio=" + precio + "\n";
    }
    
}
