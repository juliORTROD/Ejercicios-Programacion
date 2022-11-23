/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.correcioex15i16;

import java.util.Scanner;

/**
 *
 * @author juor7066
 */
public class CorrecioEx15i16 {

    public static void main(String[] args) {
        int num1, num2, num3;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Por favor introduzca tres valores separados por espacios: ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();
        
        if(num1 > num2 && num1 > num3) {
            System.out.println("El mayor es "
                    + num1); }
       else if (num2 > num1 && num2 > num3) {
            System.out.println("El mayor es " + num2);
       }
       else if (num3 > num1 && num3 > num2) {
            System.out.println("El mayor es " + num3);
       } 
       else {
            System.out.println("Los números son iguales");
       }
           }
}
