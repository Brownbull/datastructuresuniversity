/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

import clases.Postulante;
import listaLinealGenerica.Lista;
import utiles.Nombre;
import utiles.Rut;

/**
 *
 * @author 172493726
 */
public class AppPostulante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Postulante P = new Postulante();
        P.setNombre(new Nombre("que wa hermano"));
        P.setRut(new Rut("17249372-6"));
        P.setCargo("Agutero");
        
        Lista<Postulante> Ps = new Lista();
        Ps.addToEnd(P);
        P = new Postulante("Gabriel Carcamo Marambio,17249372-6,el pulento");
        Ps.addToEnd(P);
        System.out.println(Ps.toString());
       // L.remove("seis");
    }
    
}
