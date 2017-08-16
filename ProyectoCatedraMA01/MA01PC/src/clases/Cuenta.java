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
 * @author 172493726
 */
public class Cuenta {
    private String nomBanco;
    private Rut rut;
    private long numCuenta;
    private Nombre cliente;
    private double saldo;
    private Estado estado;
    
    public Cuenta(String nomBanco, Rut rut, long numCuenta, Nombre cliente, double saldo, Estado estado) {
        this.nomBanco = nomBanco;
        this.rut = rut;
        this.numCuenta = numCuenta;
        this.cliente = cliente;
        this.saldo = saldo;
        this.estado = estado;
    }
    
    public Cuenta(Cuenta cuenta) {
        this.nomBanco = cuenta.nomBanco;
        this.rut = cuenta.rut;
        this.numCuenta = cuenta.numCuenta;
        this.cliente = cuenta.cliente;
        this.saldo = cuenta.saldo;
        this.estado = cuenta.estado;
    }

   public Cuenta(String parms) {
        String[] parts = parms.split(",");
        this.nomBanco = parts[0]; 
        this.rut = new Rut(parts[1]);
        this.numCuenta = Long.parseLong(parts[2]);
        this.cliente = new Nombre(parts[3]);
        this.saldo = Double.parseDouble(parts[4]);
        this.estado = new Estado(parts[5]);
   }

    @Override
    public String toString() {
        return "Cuenta{" + "nomBanco=" + nomBanco + ", rut=" + rut + ", numCuenta=" + numCuenta + ", cliente=" + cliente + ", saldo=" + saldo + ", estado=" + estado + '}';
    }
   
   
public Cuenta(){
    this.nomBanco = "BancoEstado";
    rut = new Rut();
    numCuenta = 0;
    this.cliente = new Nombre();
    saldo = 0.0;
    // estado = Estado.ACTIVA;
    }

    public String getNomBanco() {
        return nomBanco;
    }

    public Rut getRut() {
        return rut;
    }

    public long getNumCuenta() {
        return numCuenta;
    }

    public Nombre getCliente() {
        return cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setNomBanco(String nomBanco) {
        this.nomBanco = nomBanco;
    }

    public void setRut(Rut rut) {
        this.rut = rut;
    }
    
    public void setRut() {
        this.rut = new Rut();
    }

    public void setNumCuenta(long numCuenta) {
        this.numCuenta = numCuenta;
    }

    public void setCliente(Nombre cliente) {
        this.cliente = cliente;
    }
    
    public void setCliente() {
        this.cliente = new Nombre();
    }


    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

}