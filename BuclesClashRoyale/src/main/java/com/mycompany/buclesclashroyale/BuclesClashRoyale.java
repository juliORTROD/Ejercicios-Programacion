/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.buclesclashroyale;

import java.util.Scanner;

/**
 *
 * @author juor7066
 */
public class BuclesClashRoyale {

    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quin nivell te el Llenyataire?");
        int nivellLlenyataire = sc.nextInt();
        
        System.out.println("Quin nivell te la torre");
       int nivellTorre = sc.nextInt();
       
       int danyLlenyataire, danyTorre=0, vidaLlenyataire=0, vidaTorre=0;
       
       switch (nivellLlenyataire) {
           
           case 9:
               danyLlenyataire = 200;
               break;
           case 10:
               danyLlenyataire = 220;
               break;
           case 11:
               danyLlenyataire = 242;
               break;
           default:
               danyLlenyataire = 1;
               System.out.println("Nivel imposible");
               break;
               
       }
       
              switch (nivellTorre) {
           case 1:
               vidaTorre = 1600;
               danyTorre = 50;
               break;
           case 2:
               vidaTorre = 1614;
               danyTorre = 54;
               break;
           case 3:
               vidaTorre = 1624;
               danyTorre = 58;
               break;
                       
               }
              int contadorGolpesLlenyataire=0, contadorGolpesTorre=0;
               
              // while (!(vidaTorre <= 0 || vidaLlenyataire <=0)) {
                 while (vidaTorre >= 0 && vidaLlenyataire >= 0) {    
                   
                        vidaTorre = vidaTorre - danyLlenyataire;
                        vidaLlenyataire = vidaLlenyataire - danyTorre;

                        contadorGolpesLlenyataire ++;
                        contadorGolpesTorre ++;

                        Thread.sleep(500);
                        
                        System.out.println("Leñador ataca con fuerza de valor " + danyLlenyataire + " a la torre li queda: " + vidaTorre);
                        System.out.println("Torre ataca con fuerza de valor " + danyTorre + " al Llenyataire li queda: " + vidaLlenyataire + " de vida.");

               }
                 if (vidaTorre <=0) {
                      System.out.println("El leñador HA GUANYAT i ha fet: " + contadorGolpesLlenyataire + " cops.");
                 }
                 
                 else if (vidaLlenyataire <=0 ) {
                     System.out.println("LA TORRE HA GUANYAT i ha fet: " + contadorGolpesTorre + " cops.");
        }
               
               
              
               
                
    }
        
}
