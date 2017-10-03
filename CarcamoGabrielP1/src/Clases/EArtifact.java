/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author 172493726
 */
public class EArtifact {
    private int codigoNumerico;
    private float peso;
    private String marca;
    
    public EArtifact(EArtifact P) {
        this.codigoNumerico = P.codigoNumerico;
        this.peso = P.peso;
        this.marca = P.marca;
    }
    
    public EArtifact() {
        this.codigoNumerico = 0;
        this.peso = 0;
        this.marca = "";
    }

    public EArtifact(int codigoNumerico, float peso, String marca) {
        this.codigoNumerico = codigoNumerico;
        this.peso = peso;
        this.marca = marca;
    }
    @Override
    public String toString() {
        return "Codigo Numerico=" + codigoNumerico + ", Peso=" + peso + ", Marca=" + marca + "\n";
    }
    
    public int getCodigoNumerico() {
        return codigoNumerico;
    }

    public void setCodigoNumerico(int codigoNumerico) {
        this.codigoNumerico = codigoNumerico;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
   
}
