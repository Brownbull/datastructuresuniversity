/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utiles;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author fjmackay
 */
public class TestMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
           
        String regexp = "[A-Z]{3}-\\d{3,4}";
        System.out.println(Pattern.matches(regexp, "ABC-1134"));
        
        
        String lectura = "ABC-1234";
        
        regexp = "[A-Z]{3}-\\d{3,4}";
        System.out.println(Pattern.matches(regexp, lectura));
             
        regexp = "\\d{1,2}/\\d{1,2}/\\d{4}";
        lectura = "22/05/2017";

        System.out.println(Pattern.matches(regexp, lectura));
        // TODO code application logic here
    }
    
}
