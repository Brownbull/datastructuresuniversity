/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author gordito
 */
public class Correo {
    private Fecha fecha;
    private String email;
    private String asunto;

    public Correo() {
    }

    public Correo(String texto) {
        String[] campos = texto.split(",");
        this.fecha = new Fecha(campos[0]);
        this.email=campos[1];
        this.asunto=campos[2];
    }
    
    public Correo(Correo cor){
        this.fecha=cor.fecha;
        this.email=cor.email;
        this.asunto=cor.asunto;
    }

    @Override
    public String toString() {
        return fecha + "," + email + "," + asunto;
    }
    
    
    
    
    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getasunto() {
        return asunto;
    }

    public void setasunto(String Asunto) {
        this.asunto = Asunto;
    }
    
    
}
