/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici1_examenbucles;

import java.util.Scanner;

/**
 *
 * @author juor7066
 */
public class Exercici1_examenBucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char tipusDia;
        int tipusEsmorzar;
        double tipus1=0, tipus2=0;
        
        System.out.print("Quin tipus de dia es? (Laborable: L, Dissabte: S o Festiu: F): ");
        tipusDia = sc.next().charAt(0);
        System.out.print("Quin tipus d'esmorzar vols?: ");
        tipusEsmorzar = sc.nextInt();
                
        switch (tipusDia)
        {
            case 'L':
            case 'l':
                    if (tipusEsmorzar==1) {
                        tipus1=2.00;
                        System.out.println("El preu a pagar es: " + tipus1);
                    }
                    else if (tipusEsmorzar==2){
                        tipus2=2.50;
                        System.out.println("El preu a pagar es: " + tipus2);
                    }
                    else {
                        System.out.println("Opcio incorrecta");
                    }
                break;
                
            case 'S':
            case 's':
                    if (tipusEsmorzar==1) {
                        tipus1=2.20;
                        System.out.println("El preu a pagar es: " + tipus1);
                    }
                    else if (tipusEsmorzar==2) {
                        tipus2=2.70;
                        System.out.println("El preu a pagar es: " + tipus2);
                    }
                    else {
                        System.out.println("Opcio incorrecta");
                    }
                break;
            case 'F':
            case 'f':
                    if (tipusEsmorzar==1) {
                        tipus1=2.30;
                        System.out.println("El preu a pagar es: " + tipus1);
                    }
                    else if (tipusEsmorzar==2) {
                        tipus2=2.80;
                        
                    }
                    else {
                        System.out.println("Opcio incorrecta");
                    }
                    break;
            default:
                System.out.println("Opcio incorrecta");
            }
        
    }
    
}
