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
public enum Area {
    COMEDIA("Comedia"),
    ACCION("Accion"),
    TERROR("Terror"),
    POLICIAL("Policial"),
    UNKNOWN("");

    private String nombre;

    Area(String nombre) {
        this.nombre = nombre;
    }

    public String nombre() {
        return nombre;
    }
}
