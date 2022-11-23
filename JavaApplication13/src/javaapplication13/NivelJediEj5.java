/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication13;

import java.util.Scanner;

/**
 *
 * @author juor7066
 */
public class NivelJediEj5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//5. Realiza un programa que lea un número positivo N y calcule y visualice su factorial N!
//Siendo el factorial:
//0! = 1
//1! = 1
//2! = 2 * 1
//3! = 3 * 2* 1
//N! = N * (N-1) * (N-2)........* 3*2*1
            int factorial;
            Scanner fc = new Scanner(System.in);
            System.out.println("Introduce un numero para calcular su factorial: ");
            factorial = fc.nextInt();
            int acum_factorial=1;
                    
            for (int contador = 1; contador <= factorial; contador++) {
                   acum_factorial=contador*acum_factorial;
                   
                   if (contador!=factorial) {
                   System.out.print(contador+"*");
                }
                   else {
                       System.out.println(contador);
                   }
                  
        }
           
            System.out.println("El resultado factorial es: " + acum_factorial);
        }
            

        }
    
    
