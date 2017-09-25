/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import utiles.Nombre;
import utiles.Rut;

/**
 *
 * @author 122639207
 */
public class Cuenta {
    private String nomBanco;
    private Rut rut;
    private long numCuenta;
    private Nombre cliente;
    private double saldo;
    
    public Cuenta(){
        this.nomBanco="BancoEstado";
        rut= new Rut(); // Retilización de código
        numCuenta=0;
        this.cliente=new Nombre();
        saldo=0.0;
    }

    public String getNomBanco() {
        return nomBanco;
    }

    public void setNomBanco(String nomBanco) {
        this.nomBanco = nomBanco;
    }

    public Rut getRut() {
        return rut;
    }

    public void setRut(Rut rut) {
        this.rut = rut;
    }

    public long getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(long numCuenta) {
        this.numCuenta = numCuenta;
    }

    public Nombre getCliente() {
        return cliente;
    }

    public void setCliente(Nombre cliente) {
        this.cliente = cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
}
