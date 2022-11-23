/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.switchh;

import java.util.Scanner;

/**
 *
 * @author juor7066
 */
public class SWITChh {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        
        System.out.println("**************************");
        
        System.out.println("a.-Jugar Partido Rápido");
        System.out.println("b.-Multijugador");
        System.out.println("c.-Carrera");
        System.out.println("d.-Ultimate");
        System.out.println("e.-EXIT");
        
        System.out.println("**************************");
        
        System.out.println("Escoge opción: ");
  
        char opcion = sc.nextLine().charAt();
            
            switch (opcion) {
                case "a":
                    System.out.println("Vamos a jugar un partido rápido. ");
                break;
                
                case "b:
                    System.out.println("Opción Multijugador. ");
                break;
                
                case "c:
                    System.out.println("Opción Modo Carrera. ");
                break;
                
                case d:
                    System.out.println("Ultimate Team. ");
                break;
                
                case e:
                    System.out.println("Saliendo del programa. ");
                break;
                
                default :
                    System.out.println("Introduce un valor entre 0-4.");
                
                }
        
    }
}
