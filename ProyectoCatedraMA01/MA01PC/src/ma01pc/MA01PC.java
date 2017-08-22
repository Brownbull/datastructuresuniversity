/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma01pc;

import clases.Cuenta;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author 172493726
 */
public class MA01PC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here        
        System.out.println("Hola Mundo!");
        Cuenta C = new Cuenta();
        System.out.println("Nombre = " + C.getNomBanco());
        Cuenta B = new Cuenta("Santander ql,17249372-6,123456789,el gil qlo,100,INACTIVA");
        Cuenta D = new Cuenta("Banco Estado,13457909-9,123456789,la lol cosa,100,ACTIVA");
        System.out.println(B.toString());
        
        File file = new File("DB_MA01PC.txt");
        
        int RC = B.toSave("DB_MA01PC.txt");
        int RC2 = D.toSave("DB_MA01PC.txt");
        if (RC == 0)
        {
            System.out.println("Save OK");
        }
        else
        {
            System.out.println("Unable To Save");
        }
       /* File file = new File("DB_MA01PC.txt");
        FileWriter writer;
        try {
            writer = new FileWriter(file, true);
            PrintWriter printer = new PrintWriter(writer);
            printer.append(B.toString());
            printer.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }*/
    } // end of  public static void main(String[] args)
} // end of public class MA01PC
