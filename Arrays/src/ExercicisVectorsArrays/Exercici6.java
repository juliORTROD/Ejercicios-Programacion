/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ExercicisVectorsArrays;

import java.util.Scanner;

/**
 *
 * @author juor7066
 */
public class Exercici6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce el numero de numeros que contendrá: ");
        int N = sc.nextInt();
         System.out.println("Introduce el numero que contendrá: ");
          int M = sc.nextInt();
          
          int [] array = new int [N];
          for (int i = 0; i < array.length; i++) {
            array[i] = M;
        }
        
        System.out.println("Array: ");
        utilitats.Utilitats.mostrarArray(array);
    }
}
