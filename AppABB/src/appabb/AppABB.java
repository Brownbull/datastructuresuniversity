/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appabb;

import clases.ABB;
import clases.Base;
import clases.Nodo;

/**
 *
 * @author mayor
 */
public class AppABB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Base[] items = new Base[17];
//        int[] keys = {5,1,2,3,4,0,6,7,8,9};
//        int[] infos = {5,1,2,3,4,0,6,7,8,9};
        int[] keys = {10,5,3,1,0,2,4,7,6,8,9,15,13,16,11,14,12};
        int[] infos = {10,5,3,1,0,2,4,7,6,8,90,15,13,16,11,14,12};
        int i;
        for (i = 0; i < items.length ; i++){
            items[i] = new Base(keys[i],infos[i]);
        }
        // debug
//        for (i = 0; i < 10; i++){
//            System.out.println(items[i].toString());
//        }
        
        ABB tree = new ABB();
        Nodo leaf = new Nodo();
        
        for (i = 0; i < items.length ; i++){
            tree.put(items[i]);
        }
        
//        System.out.println(tree.isEmpty());
//        System.out.println(tree.toString());
//        System.out.println(tree.toStringPostOrden());
//        System.out.println(tree.toStringPreOrden()); // thia is for debug the tree 
//        System.out.println("esta el numero 60: " + tree.contains(60));
//        System.out.println("esta el numero 60: " + tree.contains(9));
//        System.out.println("valor del elemento key 9: " + tree.get(9));
//        System.out.println("numero de elementos del arbol: " + tree.size());
//        System.out.println("suma de info de elementos del arbol: " + tree.sumarInfo());
        System.out.println("remove numero 15: " + tree.remove(15));
        System.out.println(tree.toStringPreOrden()); // thia is for debug the tree 
    }
}
