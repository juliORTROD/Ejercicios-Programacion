/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ej_menu_impresionRING;

import java.util.Scanner;

/**
 *
 * @author juor7066
 */
public class Ej_Menu_Impresion_Ring {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("0 Salir");
        System.out.println("1 Escribit 10 veces");
        System.out.println("2 Cuenta atras timbre");
        System.out.println("3 Numero par entre 2 valores");
        
        System.out.println("Elije opcion: ");
        int opcion = sc.nextInt();
        
        switch(opcion) {
            case 0:
                System.out.println("SALIENDO DEL PROGRAMA... ... ... ...");
                break;
            case 1:
                System.out.println("Decidio escribir diez veces: ");
                for (int i = 1; i <= 10; i++) {
                    System.out.println(i + ". A clase se viene a trabajar");
                } 
                break;
            case 2:
                System.out.println("Decidio cuenta atrás timbre: ");
                for (int i = 1; i <= 10; i++) {
                    System.out.print(i);
                }
                System.out.print("RIIIING");
                break;
            case 3:
                System.out.println("Fuera de servicio. ");
                break;
        }
        
    }
    
}
