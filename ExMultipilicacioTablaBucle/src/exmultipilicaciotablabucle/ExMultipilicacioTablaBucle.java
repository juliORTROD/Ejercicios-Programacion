/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exmultipilicaciotablabucle;

import java.util.Scanner;

/**
 *
 * @author juor7066
 */
public class ExMultipilicacioTablaBucle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int numero,resultado;
        
        System.out.println("Introduce un numero para mostrar su tabla: ");
        numero = sc.nextInt();
        System.out.println("LA TABLA DE MULTIPLICAR DEL NUMERO " + numero + ": ");
        for (int i = 1; i <= 10; i++) {
            resultado=i*numero;
            System.out.println(numero + " x " + i + " = " +resultado);
        }
        
    }
    
}
