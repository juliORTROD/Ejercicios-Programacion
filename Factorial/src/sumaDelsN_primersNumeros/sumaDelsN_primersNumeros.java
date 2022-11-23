/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sumaDelsN_primersNumeros;

import java.util.Scanner;

/**
 *
 * @author juor7066
 */
public class sumaDelsN_primersNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Numero para sumar: ");
        int num = sc.nextInt();
        int suma = sumaRecursiva(num);
        System.out.println("La suma es: " + suma);

    }

    public static int sumaRecursiva(int num) {
        int suma;
        if (num <= 1) {
            return num;
        } else if (num >= 1) {
            suma = num + sumaRecursiva(num - 1);
            return suma;
        }
        return -1; // si el número es negativo
    }
    
}
