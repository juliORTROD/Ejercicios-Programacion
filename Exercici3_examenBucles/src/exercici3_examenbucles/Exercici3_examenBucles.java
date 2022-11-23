/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici3_examenbucles;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author juor7066
 */
public class Exercici3_examenBucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        int num_aleatori;
        int respuesta,respuestasincorrectas=0;
        
        num_aleatori=rd.nextInt(9) + 1;
        System.out.println(num_aleatori);
        
        System.out.println("TAULA DE MULTIPLICAR DEL NUMERO: " + num_aleatori);
        for (int i = 1; i <= 10; i++) {
            
            System.out.print(num_aleatori + "*" + i + ": ");
            respuesta = sc.nextInt();
            if (respuesta != i*num_aleatori) {
                System.out.println("Resposta incorrecta, el resultat era: " + num_aleatori*i);
                respuestasincorrectas++;
            }
            
          }
            System.out.println("Has tingut: " + respuestasincorrectas + " errades.");
        }
    }
    

