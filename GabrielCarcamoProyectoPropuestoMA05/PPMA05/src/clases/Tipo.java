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
public enum Tipo {
    SERIE("Serie"),
    DOCUMENTAL("Documental"),
    PELICULA("Pelicula"),
    UNKNOWN("");

    private String nombre;

    Tipo(String nombre) {
        this.nombre = nombre;
    }

    public String nombre() {
        return nombre;
    }
}
