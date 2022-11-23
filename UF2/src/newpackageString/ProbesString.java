/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackageString;

import java.util.Scanner;

/**
 *
 * @author juor7066
 */
public class ProbesString {
    
public static void main(String[] args) {
    
        int x = 3;
        String frase = "Hola qué tal?";
        System.out.print(frase + x);
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe una frase (con sc.next): ");
        frase = sc.next();
        System.out.println("La frase con sc.nextLine seria: " + frase);
        if (frase.isEmpty()) 
        {
            System.out.println("String vacío");
        }
        else          {
            System.out.println("String no vacío");
        }
        
        char letra = frase.charAt(3); // devolvera la letra en la posicion 3.
        System.out.println("La letra en la posicion 3 es: " + letra);
        System.out.println("La longitud de la frase es: " + frase.length());
        
        for (int i = 0; i < frase.length(); i++) {
            System.out.println("En la posicion: " + i + " hay el caracter: " + frase);
    }
        
        
        System.out.println("La posicion de la letra es" + letra);
                
        do {
        frase = sc.next();
            System.out.println("palabra con next" + frase);
            
    } while (frase != null);
               
    }
}
