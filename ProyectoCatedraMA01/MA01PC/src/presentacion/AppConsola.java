/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import clases.Cuenta;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author 172493726
 */
public class AppConsola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        Scanner sTec = new Scanner(System.in);
        String archivo;
        System.out.println("Ingrese nombre de archivo: ");
        archivo = sTec.nextLine();
        // System.out.println(archivo);
        String linea;
        Cuenta c = new Cuenta();
        try {
          int i = 1;
          FileReader f = new FileReader(archivo);
          Scanner sf = new Scanner(f);
          while (sf.hasNextLine()){
              linea = sf.nextLine();
              c = new Cuenta(linea);
              System.out.println(i+"\t"+c.toString4Save());
              i++;
          }
          sf.close();
          f.close();
        }catch (IOException ex){
            System.out.println("ta mla la wa");
        }
        
    } // end of public static void main(String[] args)
    
}
