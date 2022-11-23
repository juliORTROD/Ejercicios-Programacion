/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici4bucles;

import java.util.Scanner;

/**
 *
 * @author juor7066
 */
public class Exercici4Bucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero, contador=1;
        
        System.out.print("Introduce un numero hasta donde quieres contar: ");
        Scanner sc =new Scanner(System.in);
        numero=sc.nextInt();
        
        while (contador <= numero)
            {
                System.out.println(contador);
                contador++;
            }
        
        
    }
    
}
