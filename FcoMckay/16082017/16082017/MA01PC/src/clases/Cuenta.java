/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.io.File;
import utiles.Nombre;
import utiles.Rut;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;


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
    
    public Cuenta(long n, String banco, Rut rut, Nombre nom, double s){
        this.numCuenta=n;
        this.nomBanco=banco;
        this.rut=rut;
        this.cliente=nom;
        this.saldo=s;
    }
    
    public Cuenta(Cuenta c){
        this.numCuenta=c.numCuenta;
        this.nomBanco=c.nomBanco;
        this.rut=c.rut;
        this.cliente=c.cliente;
        this.saldo=c.saldo;
    }
    
    public Cuenta(String s){
        String[]items=s.split(",");
        this.numCuenta=Long.parseLong(items[0]);
        this.nomBanco=items[1];
        this.rut = new Rut(Integer.parseInt(items[2]));
        this.cliente = new Nombre(items[3],items[4],items[5]);
        this.saldo=Double.parseDouble(items[6]);
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

    @Override
    public String toString() {
        return "Cuenta{" + "nomBanco=" + nomBanco + ", rut=" + rut + ", numCuenta=" + numCuenta + ", cliente=" + cliente + ", saldo=" + saldo + '}';
    }
    
    public boolean toSave(String Archivo) throws IOException{
        if (Archivo.length()==0)
            return false;
        else
        {
            File file = new File("archivo.txt");
            FileWriter writer;
            writer = new FileWriter(file,true);
            return true;    
        }
        
    }
}
