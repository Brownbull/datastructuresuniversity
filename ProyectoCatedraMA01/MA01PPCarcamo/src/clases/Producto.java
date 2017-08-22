/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;
import Utiles.Fecha;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author 172493726
 */
public class Producto {
    private int codigo;
    private String nombre;
    private Fecha fechaVenc;
    private Double margen;
    private Double costo;
    private int unidades;

    public Producto() {
        this.codigo = 0;
        this.nombre = "";
        this.fechaVenc = new Fecha();
        this.margen = 0.0;
        this.costo = 0.0;
        this.unidades = 0;
    }
    
    public Producto(String s) {
        String[] datos = s.split(",");
        this.codigo = Integer.parseInt(datos[0]);
        this.nombre = datos[1];
        this.fechaVenc = new Fecha(datos[2]);
        this.margen = Double.parseDouble(datos[3]);
        this.costo = Double.parseDouble(datos[4]);
        this.unidades = Integer.parseInt(datos[5]);
    }
    
    public Producto(Producto s) {
        this.codigo = s.codigo;
        this.nombre = s.nombre;
        this.fechaVenc = s.fechaVenc;
        this.margen = s.margen;
        this.costo = s.costo;
        this.unidades = s.unidades;
    }
    
  
    @Override
    public String toString(){
        StringBuffer s = new StringBuffer();
        s.append(codigo);
        s.append(",");
        s.append(nombre);
        s.append(",");
        s.append(fechaVenc.toString());
        s.append(",");
        s.append(margen);
        s.append(",");
        s.append(costo);
        s.append(",");
        s.append(unidades);
        return s.toString();
    }

    public boolean toSave(String FilePath)
   {
        FileWriter writer;
        try {
            writer = new FileWriter(FilePath);
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

    public Fecha getFechaVenc() {
        return fechaVenc;
    }

    public void setFechaVenc(Fecha fechaVenc) {
        this.fechaVenc = fechaVenc;
    }

    public Double getMargen() {
        return margen;
    }

    public void setMargen(Double margen) {
        this.margen = margen;
    }

    public Double getCosto() {
        return costo;
    }

    public void setCosto(Double costo) {
        this.costo = costo;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }
    
    
    
}
