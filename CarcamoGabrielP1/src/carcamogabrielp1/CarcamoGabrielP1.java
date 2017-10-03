/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carcamogabrielp1;

import Clases.Stack;
import Clases.Queue;
import Clases.EArtifact;
import Clases.Lista;
import java.util.Scanner;

/**
 *
 * @author 172493726
 */
public class CarcamoGabrielP1 {

    /**
     * @param args the command line arguments
     */
    
    // Esta funcion obtendra y generara valores para un nuevo artefacto electornico
    public static EArtifact getEArtifactVars()
    {
        int codigoNumerico; 
        float peso;
        String marca;
        
        Scanner sf = new Scanner(System.in);
        System.out.print("Codigo Numerico : ");        
        codigoNumerico = sf.nextInt();
        System.out.print("Peso : ");        
        peso = sf.nextFloat();
        System.out.print("Marca : ");        
        marca = sf.next();
        
        return new EArtifact(codigoNumerico, peso, marca);
    }
    
    // Esta funcion obtendra el numero de cajas disponibles en todos los containers
    public static void AgregarEArtifact(Queue<EArtifact> Caja, EArtifact P)
    {
        Caja.add(P);
    }
        
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Sistema de Container San Isidro");
        EArtifact P = new EArtifact();
        Stack<Stack> Puerto = new Stack();
        Stack<Queue> Container = new Stack();
        Queue<EArtifact> Caja = new Queue();
        
        // debug code - start
        //Caja.add(P);
        //Container.Push(Caja);
        //System.out.println(Container.toString());
        // debug code - end
        
        // Inicializacion de menu
        int op = 0;
        while (op != 7){
            System.out.println("Selecciona Operacion");
            System.out.println("1. Agregar Artefacto electronico a la caja especial");
            System.out.println("2. Completar una caja con \"n\" artefactos electronicos");
            System.out.println("3. Agregar una caja especial en un contenedor");
            System.out.println("4. Completar un contenedor con \"m\" cajas especiales");
            System.out.println("5. Generar y completar una estructura de dato, para administrar \"k\" contenedores");
            System.out.println("6. Proceso de consulta de carga total de un contenedor");
            System.out.println("7. Salir");
            Scanner sf = new Scanner(System.in);
            System.out.print("Opcion : ");        
            op = sf.nextInt();           
            
            switch(op){
                case 1:
                    //System.out.println("1. Agregar Artefacto electronico a la caja especial");
                    P = getEArtifactVars();
                    Caja.add(P);
                    System.out.println(" Artefacto electronico agregado: \n" + Caja.toString());
                    break;
                case 2:
                    //System.out.println("2. Completar una caja con \"n\" artefactos electronicos");
                    System.out.print("Indique numero de artefactos electronicos para completar caja \n: "); 
                    int n = sf.nextInt();
                    int i;
                    for (i = 1; i <= n; i++){
                        EArtifact A = new EArtifact(i,0,"");
                        Caja.add(A);
                    }
                    System.out.println(" Artefactos electronicos agregados: \n" + Caja.toString());
                    break;
                case 3:
                    //System.out.println("3. Agregar una caja especial en un contenedor");
                    Container.Push(Caja);
                    System.out.println(" Caja especial agregada: \n" + Container.toString());
                    System.out.println(" Ahora tienes una nueva caja especial");
                    Caja = new Queue();
                case 4:
                    //System.out.println("4. Completar un contenedor con \"m\" cajas especiales");
                    System.out.print("Indique numero de cajas especiales para completar el container \n: "); 
                    int m = sf.nextInt();
                    for (i = 1; i <= m; i++){
                        Queue<EArtifact> Box = new Queue();
                        EArtifact B = new EArtifact(i,i+24,"a cuenta");
                        Box.add(B);
                        B = new EArtifact(i+10,i+2,"Ekono");
                        Box.add(B);
                        Container.Push(Box);
                        System.out.println(" Caja especial " + i + " agregada: \n" + Box.toString());
                    }
                    System.out.println("Todas las cajas especiales agregadas: \n" + Container.toString());
                    break;
                case 5:
                    //System.out.println("5. Generar y completar una estructura de dato, para administrar \"k\" contenedores");
                    System.out.print("Indique numero de contenedores a generar \n: "); 
                    int all = sf.nextInt();
                    for (i = 1; i <= all; i++){
                        Queue<EArtifact> Box = new Queue();
                        EArtifact B = new EArtifact(i,i+24,"a cuenta");
                        Box.add(B);
                        Container.Push(Box);
                        Puerto.Push(Container);
                        System.out.println(" Contenedor " + i + " agregado: \n" + Container.toString());
                        Container = new Stack();
                    }
                    System.out.println("Contenedores generados para todo el puerto: \n" + Puerto.toString());
                    break;
                case 6:
                    //System.out.println("6. Proceso de consulta de carga total transportada en el puerto");
                    float PesoTotal = 0;
                    while(Puerto.isEmpty() != true){
                        Container = Puerto.Pop();
                        while(Container.isEmpty() != true){
                            Caja = Container.Pop();
                            while(Caja.isEmpty() != true){
                                float aux = Caja.getPrimero().getInfo().getPeso();
                                PesoTotal = PesoTotal + aux;
                                Caja.remove();
                            }
                        }
                            
                    }
                    System.out.println("Carga total transportada en el puerto:" + PesoTotal);
                    break;
            }
        }

    } // end of public static void main(String[] args)
    
} // end of public class CarcamoGabrielP1 
