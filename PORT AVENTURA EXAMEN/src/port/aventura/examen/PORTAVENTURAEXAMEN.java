/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package port.aventura.examen;

import java.util.Scanner;

/**
 *
 * @author juor7066
 */
public class PORTAVENTURAEXAMEN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int PRECIO_ADULTO = 20;
        final int PRECIO_MENOR = 10;
        Scanner sc = new Scanner(System.in);
        System.out.println("QUANTES ENTRADES VOLS?");
        int total_entrades = sc.nextInt();
        System.out.println("QUANTS MENOS HI HA?");
        int menors = sc.nextInt();
        int adults = total_entrades - menors;
        
        double precio_final = adults * PRECIO_ADULTO + menors * PRECIO_MENOR;
        
        System.out.println("EN TOTAL DEBES PAGAR: " + precio_final);
    }
    
}
