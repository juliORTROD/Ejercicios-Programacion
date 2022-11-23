/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package app.adivina.tu.numero;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author juor7066
 */
public class AppAdivinaTuNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        
        System.out.println("Estoy generando un numero mamahuevo.");
        int num_aleatori;
        num_aleatori=rd.nextInt(100) + 1;

        int num_usuari;
        do {
        
        System.out.println("Introduce numeros para adivinar el mio caraverga(ENTRE 1 Y 100 QUE ME DA PALO).");
        num_usuari = sc.nextInt();
        int cont_num=0;
        cont_num++;
        
        
            if (num_usuari < num_aleatori) {
                System.out.println("El numero random es mas grande gilipollas");
                
                
            }
            else { System.out.println("El numero random es mas pequeño. ");
                    }
        } while (num_usuari!= num_aleatori);    
        System.out.println("HAS ADIVINADO");


        
    }
    
}
