/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author guillermo
 */
public class Programa {
    private String nombre;
    private Area area;
    private Tipo tipo;
    private int duracion;

    
    public Programa(){
    this.nombre = "";
    this.area = Area.UNKNOWN;
    this.tipo = Tipo.UNKNOWN;
    this.duracion = 0;
    }
    public Programa(String nombre, Area area, Tipo tipo, int duracion) {
        this.nombre = nombre;
        this.area = area;
        this.tipo = tipo;
        this.duracion = duracion;
    }
    public Programa(String p){
        String data[] = p.split(",");
        this.nombre = data[0];
        switch(data[1]){
            case("Comedia"):
            case("comedia"):
                this.area = Area.COMEDIA;
                break;
            case("Acción"):
            case("acción"):
            case("accion"):
            case("Accion"):
                this.area = Area.ACCION;
                break;
            case("Terror"):
            case("terror"):
                this.area = Area.TERROR;
                break;
            case("Policial"):
            case("policial"):
                this.area = Area.POLICIAL;
                break;
            default:
                this.area = Area.UNKNOWN;
                break;
        }
        switch(data[2]){
            case("Serie"):
            case("serie"):
                this.tipo = Tipo.SERIE;
                break;
            case("documental"):
            case("Documental"):
                this.tipo = Tipo.DOCUMENTAL;
                break;
            case("Película"):
            case("pelìcula"):
            case("pelicula"):
            case("Pelicula"):
                this.tipo = Tipo.PELICULA;
                break;
            default:
                this.tipo = Tipo.UNKNOWN;
                break;
        }
        this.duracion = Integer.parseInt(data[3]);
    }
    
    
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Programa: " + "nombre: " + nombre + ", area: " + area.nombre() + ", tipo: " + tipo.nombre() + ", duracion: " + duracion + " Minutos";
    }
    
    
}
