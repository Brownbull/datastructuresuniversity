/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import estructuras.Queue;
import estructuras.Stack;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author guillermo
 */
public class BancoMayor {
    private Queue<Cliente> ColaEspera;
    private Stack<ClienteAtendido> StackAtencion;
    
    public BancoMayor(){
        ColaEspera = new Queue();
        StackAtencion = new Stack();
    }
    
    public void CargarCola(String nombreArchivo){
        ColaEspera = new Queue();
        StackAtencion = new Stack();
        String linea;
        try{
            FileReader f = new FileReader(nombreArchivo+".txt");
            Scanner sf = new Scanner(f);
            while(sf.hasNextLine()){
                linea = sf.nextLine();
                ColaEspera.Add(new Cliente(linea));
            }
            sf.close();
            f.close();
        }catch (IOException ex){
            System.out.println("Error al abrir el archivo");
        }
    }
    public void SimularEnMinutos(int minutos){
        while(!ColaEspera.isEmpty() && minutos >= ColaEspera.getPrimero().getInfo().getTiempo() ){
            minutos -= ColaEspera.getPrimero().getInfo().getTiempo();
            StackAtencion.Push(new ClienteAtendido(ColaEspera.remove()));
        }
    }
    
    public void SimularEnCantidad(int cantidad){
        while(!ColaEspera.isEmpty() && cantidad > 0){
            cantidad--;
            StackAtencion.Push(new ClienteAtendido(ColaEspera.remove()));
        }
    }
    
    public void AnadirCliente(String c){
        ColaEspera.Add(new Cliente(c));
    }
    
    public void EliminarCliente(){
        if(!ColaEspera.isEmpty()){
        ColaEspera.remove();
        }
        
    }
     public boolean toSave(String archivo){
        try{
        FileWriter s = new FileWriter(archivo);
        BufferedWriter bw = new BufferedWriter(s);
        PrintWriter p = new PrintWriter(bw);
        p.println(ColaEspera);
        p.close();
        bw.close();
        s.close();
        return true;
    } catch (IOException e) {
       return false;
    }
    
    
    }
    
    public Queue<Cliente> getColaEspera() {
        return ColaEspera;
    }

    public void setColaEspera(Queue<Cliente> ColaEspera) {
        this.ColaEspera = ColaEspera;
    }

    public Stack<ClienteAtendido> getStackAtencion() {
        return StackAtencion;
    }

    public void setStackAtencion(Stack<ClienteAtendido> StackAtencion) {
        this.StackAtencion = StackAtencion;
    }
   
}
