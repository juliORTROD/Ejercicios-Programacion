/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici2_examenbucles;

import java.util.Scanner;

/**
 *
 * @author juor7066
 */
public class Exercici2_examenBucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double intervalMinim, intervalMaxim,graus=0;
        
        
        System.out.println("Introdueix l'interval de les temperatures a convertir de Celsius a Fahrenheit:");
        System.out.println("Interval menor: ");
        intervalMinim = sc.nextDouble();
        System.out.println("Interval maximo: ");
        intervalMaxim = sc.nextDouble();
        
        
        
        while (graus<intervalMaxim){
            graus=intervalMinim++;
            
            double grausFaren = 9/5*graus+32;
            
            System.out.println(graus + " C" + " - " + grausFaren + " F.");
            
            
        }
    }
    
}
