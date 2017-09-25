/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import static java.awt.PageAttributes.MediaType.B;
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
    private Estado estado;
    
    public Cuenta(){
        this.nomBanco="BancoEstado";
        rut= new Rut(); // Retilización de código
        numCuenta=0;
        this.cliente=new Nombre();
        saldo=0.0;
        estado=Estado.Activo;
    }
    
    public Cuenta(long n, String banco, Rut rut, Nombre nom, double s, Estado est){
        this.numCuenta=n;
        this.nomBanco=banco;
        this.rut=rut;
        this.cliente=nom;
        this.saldo=s;
        this.estado=est;
    }
    
    public Cuenta(Cuenta c){
        this.numCuenta=c.numCuenta;
        this.nomBanco=c.nomBanco;
        this.rut=c.rut;
        this.cliente=c.cliente;
        this.saldo=c.saldo;
        this.estado=c.estado;
    }
    
    public Cuenta(String s){
        String[]items=s.split(",");
        this.numCuenta=Long.parseLong(items[0]);
        this.nomBanco=items[1];
        this.rut = new Rut(Integer.parseInt(items[2]));
        this.cliente = new Nombre(items[3],items[4],items[5]);
        this.saldo=Double.parseDouble(items[6]);
        this.estado=Estado.valueOf(items[7]);
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
    
    public void setEstado(Estado estado){
        this.estado=estado;
    }
    
    public Estado getEstado(){
        return estado;
    }
    
            

    @Override
    public String toString() {
        
        StringBuffer s= new StringBuffer();
        s.append("Cuenta{");
        s.append("nombanco= ");
        s.append(nomBanco);
        s.append(", rut= ");
        s.append(rut.toString());
        s.append(", numCuenta= ");
        s.append(numCuenta);
        s.append(", cliente= ");
        s.append(cliente.toString());
        s.append(", saldo= ");
        s.append(saldo);
        s.append(". estado= ");
        s.append(estado);
        s.append('}');
        return s.toString();       
    }
    
    public boolean toSave(String Archivo) throws IOException{
        if (Archivo.length()==0)
            return false;
        else
        {
            File file = new File("DB_MA01PC.txt");
            FileWriter writer;
            try {
            writer = new FileWriter(file, true);
            PrintWriter printer = new PrintWriter(writer);
            printer.append(this.toString());
            printer.close();
            writer.close();
            return true;    
            } catch (IOException e) {
            // TODO Auto-generated catch block
                e.printStackTrace();
                return false;
            }
         
        }
        
    }
}
