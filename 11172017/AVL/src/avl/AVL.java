/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avl;

import Clases.AVLTree;

/**
 *
 * @author Profesores
 */
public class AVL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("AVL");
        AVLTree avl = new AVLTree();
        System.out.println("\nins 1");
        avl.insert(1);
        avl.InOrder();
        
        System.out.println("\nins 2");
        avl.insert(2);
        avl.InOrder();
        
        System.out.println("\nins 3");
        avl.insert(3);
        avl.InOrder();
        
        System.out.println("\nins 4");
        avl.insert(4);
        avl.InOrder();

        System.out.println("\ndel 1");        
        avl.delete(1);
        avl.InOrder();
        
        System.out.println("\nins 5");
        avl.insert(5);
        avl.InOrder();
        
        System.out.println("\nins 6");
        avl.insert(6);
        avl.InOrder();
        
        System.out.println("\ndel 3");
        avl.delete(3);
        avl.InOrder();
        
        System.out.println("\ndel 5");
        avl.delete(5);
        avl.InOrder();
    }
    
}
