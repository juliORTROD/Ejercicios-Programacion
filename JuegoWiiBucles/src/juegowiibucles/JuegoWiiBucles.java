/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package juegowiibucles;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author juor7066
 */
public class JuegoWiiBucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int petardo1, petardo2, petardo3;
        
        
        System.out.println("Que petardo quieres? (1, 2 o 3): ");
        int eleccionPetardo = sc.nextInt();
      
        
        
        
        petardo1 = rd.nextInt(10)+1;

        petardo2 = rd.nextInt(10)+1;
  
        petardo3 = rd.nextInt(10)+1;
        
        
        switch (eleccionPetardo) {
            case 1: //he elegido el petardo
                if (petardo1 >= petardo2 && petardo1 >= petardo3) {
                      System.out.println("HAS GANADO");  
                              }
                else {
              System.out.println("HAS PERDIDO");
                     }
                break;
                
            case 2: 
                if (petardo2 >= petardo1 && petardo2 >= petardo3) {
                    System.out.println("HAS GANADO");
                }
                else {
                    System.out.println("HAS PERDIDO");
                }
                break;
            case 3:
                if (petardo3 >= petardo1 && petardo3 >= petardo2) {
                    System.out.println("HAS GANADO");}
                else {
                    System.out.println("HAS PERDIDO");
                }
                break;
                
        }
        //pintar asteriscos o espacios
        // int petardo1, petardo2, petardo3;
        
        for (int linea = 1; linea < 10; linea++) {
            if (linea<=petardo1) {
                
                System.out.print("* ");
            }
            else { 
                    System.out.print("_ ");
            }
            
            if (linea<=petardo2) {
                
                System.out.print("$ ");
            }
            else {
                System.out.print("/ ");
            }
            if (linea<=petardo3) {
                
                System.out.print("3 ");
            }
            else {
                System.out.print("e3 ");
                
        }
                    
        }
    }
}

        
       

        
    

