/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicaexamenifs;

import java.util.Scanner;

/**
 *
 * @author juor7066
 */
public class PracticaExamenIFS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Introdueix una data.");
        Scanner sc = new Scanner(System.in);
        
        int maximDia=31;
        int maximMes=12;
        int mínimAny = 1900;
        int dia = sc.nextInt();
        int mes = sc.nextInt();
        int any = sc.nextInt();
        
        if (dia > maximDia || dia < 0) {
            System.out.println("El día es incorrecte. ");
        }
        else if (dia > 28 && mes==2 ) {
            System.out.println("El dia de febrer es incorrecte. ");
        }
        else if (any<1900) {
            System.out.println("L'any es incorrecte. ");
        }
        else{
            System.out.println("PERFECTE");    
        }
    }
    
}
