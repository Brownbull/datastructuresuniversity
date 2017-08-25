/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import enumerados.Estado;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import utiles.Nombre;
import utiles.Rut;

/**
 *
 * @author NVA
 */
public class Cuenta {
    private String nomBanco;
    private Rut rut;
    private long numCuenta;
    private Nombre cliente;
    private double saldo;
    private Estado estado;
    
    public Cuenta(){
        nomBanco="Chile";
        rut= new Rut();  //Instanciar
        numCuenta=0;
        cliente= new Nombre();
        this.saldo=0.0;
        this.estado=Estado.SIN_DEFINICION;
    }
    public Cuenta(long n,String banco,Rut rut,Nombre nom,
            double s,Estado e){
        nomBanco=banco;
        this.rut= new Rut(rut);  //Instanciar
        numCuenta=n;
        cliente= new Nombre(nom);
        this.saldo=s;
        this.estado=e;
    }

    public Cuenta(Cuenta c){
        nomBanco=c.nomBanco;
        rut= new Rut(c.rut);  //Instanciar
        numCuenta=c.numCuenta;
        cliente= new Nombre(c.cliente); //Instanciar
        this.saldo=c.saldo;
        this.estado=c.estado;
    }
    
    public Cuenta(String c){
        //100,Estado,18676228-2,Juan Valdés Arias,120000.0,ACTIVA
        String[]datos;
        datos= c.split(",");
        nomBanco=datos[1];
        rut= new Rut(datos[2]);  //Instanciar
        numCuenta=Long.parseLong(datos[0]);
        cliente= new Nombre(datos[3]);
        this.saldo=Double.parseDouble(datos[4]);
        this.estado=Estado.valueOf(datos[5]);
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
    
    public void setRut(String rut) {
        this.rut = new Rut(rut);
    }
    
    public void setRut(int rut) {
        this.rut = new Rut(rut);
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

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    public void setEstado(String estado) {
        this.estado = Estado.valueOf(estado);
    }
    
    public String toString(){
        //100,Estado,18676228-2,Juan Valdés Arias,120000.0,ACTIVA
        StringBuilder s= new StringBuilder();
        s.append(numCuenta);
        s.append(",");
        s.append(nomBanco);
        s.append(",");
        s.append(this.rut.toString());
        s.append(",");
        s.append(cliente.toString());
        s.append(",");
        s.append(saldo);
        s.append(",");
        s.append(estado.toString());
        return s.toString();
    }
    
    public boolean toSave(String archivo){
        try{
            FileWriter f= new FileWriter(archivo, true);
            PrintWriter p= new PrintWriter(f);
            p.println(this.toString());
            p.close();
            f.close();
            return true;
        }
        catch(IOException ex){
            return false;
        }
    }
    
}
